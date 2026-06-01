package com.telusko.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

    private static List<Alien> aliens = new ArrayList<>();

    static {

        Alien a1 = new Alien();
        a1.setId(101);
        a1.setName("Harsh");
        a1.setPoints(99);

        Alien a2 = new Alien();
        a2.setId(102);
        a2.setName("Chanchu");
        a2.setPoints(100);

        aliens.add(a1);
        aliens.add(a2);
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public Alien getAlien(int id) {

        for (Alien a : aliens) {
            if (a.getId() == id) {
                return a;
            }
        }

        return null;
    }

    public void create(Alien a) {
        aliens.add(a);
    }
}
