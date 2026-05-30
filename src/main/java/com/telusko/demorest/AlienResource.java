package com.telusko.demorest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("aliens")
public class AlienResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Aliens getAlien() {

        Alien a1 = new Alien();
        a1.setName("Harsh");
        a1.setPoints(99);

        Alien a2 = new Alien();
        a2.setName("Chanchu");
        a2.setPoints(100);

        List<Alien> list = Arrays.asList(a1, a2);

        Aliens aliens = new Aliens();
        aliens.setAliens(list);

        return aliens;
    }
}