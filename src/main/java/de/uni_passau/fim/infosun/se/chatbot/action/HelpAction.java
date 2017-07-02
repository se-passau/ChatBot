package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

public class HelpAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("hilf");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Womit kann ich Ihnen behilflich sein?");
        return true;
    }
}
