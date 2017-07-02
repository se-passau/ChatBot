package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

public interface Action {

    /**
     * Returns whether an input request can be handled by this <code>Action</code>.
     *
     * @param request Input request
     * @return <code>true</code> if request can be handled
     */
    public boolean accept(String request);

    /**
     * Runs the <code>Action</code> on the specified input request.
     * Output is written to the provided <code>PrintStream</code>.
     *
     * @param request Input request
     * @param out <code>PrintStream</code> used for feedback
     * @return <code>true</code> if the conversation should continue after <code>Action</code>
     */
    public boolean run(String request, PrintStream out);
}
