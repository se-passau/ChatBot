package de.uni_passau.fim.infosun.se.chatbot.action;

import de.uni_passau.fim.infosun.se.chatbot.API;
import http.HttpClient;
import json.JsonConverter;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This <code>Action</code> accepts keywords that indicate inquiries about the weather forecast.<br/>
 * <br/>
 * TODO: Respond with current information retrieved from a suitable online service.
 */
public class WeatherAction implements Action {

    private static int cityId = 2855328;
    private static String weatherUrl =
            "http://api.openweathermap.org/data/2.5/weather?id=%d&units=metric&appid=%s";

    @Override
    public boolean accept(String request) {
        return request.contains("wetter")
                || request.contains("temperatur");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        String url = String.format(weatherUrl, cityId, API.WEATHER_API_KEY);
        String jsonObjects[] = {"main", "temp"};
        ArrayList<String> keys = new ArrayList<>(Arrays.asList(jsonObjects));

        try {
            String jsonResponse = HttpClient.getContent(url);
            String temperature = JsonConverter.getContentOfElement(jsonResponse, keys);

            out.println("Die Temperatur in Passau beträgt derzeit " + temperature + "◦C");
        } catch (IOException e) {
            out.println("Der Wetterfrosch ist heute leider krank :(");
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return true;
    }
}
