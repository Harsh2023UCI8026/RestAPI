package com.telusko.demorest;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

    AlienRepository repo = new AlienRepository();

    @GET
    @Path("alien")
    @Produces(MediaType.APPLICATION_XML)
    public List<Alien> getAlien() {
        return repo.getAliens();
    }

    @POST
    @Path("alien")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Alien createAlien(Alien a) {

        repo.create(a);

        return a;
    }
}