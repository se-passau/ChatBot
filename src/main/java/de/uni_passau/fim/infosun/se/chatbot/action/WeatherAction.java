package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> accepts keywords that indicate inquiries about the weather forecast.<br/>
 * <br/>
 * TODO: Respond with current information retrieved from a suitable online service.
 */
public class WeatherAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("wetter")
                || request.contains("temperatur");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Der Wetterfrosch ist heute leider krank :(");
        return true;
    }
}
