package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> accepts keywords that request assistance,
 * and responds with a respective message.<br/>
 * <br/>
 * TODO: Offer some kind of hints w.r.t. which actions are currently supported.
 */
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
