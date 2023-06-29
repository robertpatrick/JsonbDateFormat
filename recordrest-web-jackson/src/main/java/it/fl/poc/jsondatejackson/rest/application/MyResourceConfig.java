package it.fl.poc.jsondatejackson.rest.application;

import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import it.fl.poc.jsondatejackson.rest.DateDemoService;

@ApplicationPath("/resources2")
public class MyResourceConfig extends ResourceConfig{

    private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.rest.application.ResourceConfig");

    public MyResourceConfig(){
        logger.info("@FL MyResourceConfig()");
        register(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
        register(org.glassfish.jersey.jackson.JacksonFeature.class);
        register(DateDemoService.class);
    }
    
}
