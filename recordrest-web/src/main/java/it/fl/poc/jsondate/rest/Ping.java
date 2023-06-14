package it.fl.poc.jsondate.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/ping")
public class Ping {

    @GET
    @Produces(MediaType.APPLICATION_JSON) 
    public Object ping(){
        return "pong";
    }
}