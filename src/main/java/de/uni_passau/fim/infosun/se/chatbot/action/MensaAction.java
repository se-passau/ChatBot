package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;
import java.util.Calendar;

/**
 * This <code>Action</code> responds to keywords related to food.<br/>
 * It determines whether the canteen is within its opening hours and provides a link to the menu.
 */
public class MensaAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("hunger")
                || request.contains("mensa")
                || request.contains("essen");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour >= 11 && hour <= 14) {
            out.println("Schau doch mal auf https://stwno.de/de/gastronomie/speiseplan/uni-passau");
        } else {
            out.println("Sowas Dummes ... die Mensa hat leider zu :(");
        }

        return false;
    }
}
