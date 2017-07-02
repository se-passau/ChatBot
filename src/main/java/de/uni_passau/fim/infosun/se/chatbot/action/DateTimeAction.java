package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("zeit")
                || request.contains("datum")
                || request.contains("spät")
                || request.contains("uhr")
                || request.contains("tag");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE, 'der' dd.MM.yyyy. 'Es ist' HH:mm 'Uhr.'");
        out.format("Heute ist %s\n", dateFormat.format(Calendar.getInstance().getTime()));
        return true;
    }
}
