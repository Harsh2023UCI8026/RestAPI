package com.telusko.demorest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("myresource")
public class MyResource {

    @GET
    public String getIt() {
        return "Got it!";
    }
}
