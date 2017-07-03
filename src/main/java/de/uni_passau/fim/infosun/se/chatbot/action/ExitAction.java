package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> accepts keywords that indicate a wish to terminate the conversation.
 */
public class ExitAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("wiedersehen")
                || request.contains("exit")
                || request.contains("servus")
                || request.contains("tschüss");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Auf Wiedersehen!");
        return false;
    }
}
