package it.fl.poc.jsondatejackson.rest.application;

import java.util.logging.Logger;

// import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// import com.fasterxml.jackson.core.util.JacksonFeature;

public class ApplicationConfig extends Application {

     private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.rest.application.ApplicationConfig");

     public ApplicationConfig(){
         super();
         logger.info("ApplicationConfig()");
     }

}
