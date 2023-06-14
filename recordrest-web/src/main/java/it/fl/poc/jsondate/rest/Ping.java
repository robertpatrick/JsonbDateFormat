package it.fl.poc.jsondate.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/service")
@Produces(MediaType.APPLICATION_JSON)

public class Ping {
    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON) 
    public String ping(){
        return "pong";
    }
}