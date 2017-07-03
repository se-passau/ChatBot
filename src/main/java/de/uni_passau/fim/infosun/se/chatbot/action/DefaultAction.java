package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> can be used as a fallback:
 * It accepts any request and responds with a default answer.
 */
public class DefaultAction implements Action {
    @Override
    public boolean accept(String request) {
        return true;
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Hmm ... interessant.");
        return true;
    }
}
