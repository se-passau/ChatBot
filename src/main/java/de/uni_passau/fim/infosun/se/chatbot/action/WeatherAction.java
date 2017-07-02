package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

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
