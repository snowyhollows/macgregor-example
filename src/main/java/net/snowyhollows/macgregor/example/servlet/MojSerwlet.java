package net.snowyhollows.macgregor.example.servlet;

import net.snowyhollows.macgregor.example.component.WidokOsoby;
import net.snowyhollows.macgregor.example.component.WidokOsobyTemplated;
import net.snowyhollows.macgregor.example.model.Kontakt;
import net.snowyhollows.macgregor.example.model.Osoba;
import net.snowyhollows.macgregor.pier.MacServlet;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(urlPatterns = "/osoba")
public class MojSerwlet extends MacServlet<WidokOsoby> {

    @Override
    public WidokOsoby createComponent() {
        WidokOsoby widokOsoby = new WidokOsobyTemplated();
        widokOsoby.setModel(new Osoba("Jan", "Kowalski", new ArrayList<>(Arrays.asList(
                new Kontakt("660423770", Kontakt.TypKontaktu.MOBILE),
                new Kontakt("fdreger@kowalski.net", Kontakt.TypKontaktu.EMAIL),
                new Kontakt("http://google.com", Kontakt.TypKontaktu.WWW)
        ))));
        return widokOsoby;
    }
}
