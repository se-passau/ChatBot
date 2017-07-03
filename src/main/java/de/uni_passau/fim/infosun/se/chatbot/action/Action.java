package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This interface specifies an <code>Action</code> that may be run by the bot.<br/>
 * <br/>
 * Each <code>Action</code> implements an <code>accept()</code> and a <code>run()</code> method.<br/>
 * <br/>
 * <code>accept()</code> determines whether the <code>Action</code> can be applied on the specified input request,
 * <code>run</code> executes the <code>Action</code> and specifies via its <code>return</code> value
 * whether the conversation is to be continued afterwards.
 */
public interface Action {

    /**
     * Returns whether an input request can be handled by this <code>Action</code>.
     *
     * @param request Input request
     * @return <code>true</code> if request can be handled
     */
    boolean accept(String request);

    /**
     * Runs the <code>Action</code> on the specified input request.<br/>
     * Output is written to the provided <code>PrintStream</code>.
     *
     * @param request Input request
     * @param out <code>PrintStream</code> used for feedback
     * @return <code>true</code> if the conversation should continue after <code>Action</code>
     */
    boolean run(String request, PrintStream out);
}
