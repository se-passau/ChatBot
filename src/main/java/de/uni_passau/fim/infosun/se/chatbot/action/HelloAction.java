package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

public class HelloAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("hallo")
                || request.contains("hi");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Hallo!");
        return new HelpAction().run(request, out);
    }
}
