package com.telusko.demorest;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.PathParam;


@Path("aliens")
public class AlienResource {

    AlienRepository repo = new AlienRepository();

    // GET /aliens
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Alien> getAliens() {
        return repo.getAliens();
    }
    
    @GET
    @Path("alien/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Alien getAliens(@PathParam("id") int id) {
        return repo.getAlien(id);
    }

    // GET /aliens/alien
    @GET
    @Path("alien")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) 
    public List<Alien> getAlien() {
        return repo.getAliens();
    }
    

    // POST /aliens
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  
    public Alien createAlien1(Alien a) {
        repo.create(a);
        return a;
    }

    // POST /aliens/alien
    @POST
    @Path("alien")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})   
    public Alien createAlien2(Alien a) {
        repo.create(a);
        return a;
    }
}
