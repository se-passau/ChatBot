package de.uni_passau.fim.infosun.se.chatbot;

import de.uni_passau.fim.infosun.se.chatbot.action.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is the main class of the bot.<br/>
 * It initializes a list of supported <code>Action</code>s,
 * and tries to apply them to provided input requests in the order of their initialization.<br/>
 * The first <code>Action</code> that accepts a request is run on that input,
 * and the program continues reading the next input from the user.<br/>
 * If an <code>Action</code> requests the end of the conversation, the program terminates.
 */
public class Main {

    private Main() {}

    public static void main(String[] args) {
        List<Action> handlers = new ArrayList<>();
        handlers.add(new WeatherAction());
        handlers.add(new DateTimeAction());
        handlers.add(new MensaAction());
        handlers.add(new ExitAction());
        handlers.add(new HelpAction());
        handlers.add(new HelloAction());
        handlers.add(new DefaultAction());

        Scanner input = new Scanner(System.in);
        boolean active = true;

        System.out.println("Hallo!");

        while (active) {
            System.out.print("> ");
            String request = input.nextLine().toLowerCase();

            for (Action action : handlers) {
                if (action.accept(request)) {
                    active = action.run(request, System.out);
                    break;
                }
            }
        }

        input.close();
    }
}
