package it.fl.poc.jsondatejackson.rest.application;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//import com.fasterxml.jackson.core.util.JacksonFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import it.fl.poc.jsondatejackson.rest.DateDemoService;
import it.fl.poc.jsondatejackson.rest.PingService;
import it.fl.poc.jsondatejackson.rest.RecordService;


@ApplicationPath("/resources")
public class ApplicationConfig extends Application {

     private final Logger logger = Logger.getLogger("it.fl.poc.jsondate.rest.application.ApplicationConfig");

     public ApplicationConfig(){
        logger.info("@FL ApplicationConfig()");
        
     }

    @Override
    public Set<Class<?>> getClasses() {
        logger.info("@FL getClasses()");
        Set<Class<?>> classes = new HashSet<>();
        classes.add(JacksonJaxbJsonProvider.class);
        classes.add(DateDemoService.class);
        classes.add(PingService.class);
        classes.add(RecordService.class);
        return classes;
    }

    @Override
    public Set<Object> getSingletons(){
        logger.info("@FL getSingletons()");
        Set<Object> singletons = new HashSet<Object>();
        singletons.add(new JacksonJaxbJsonProvider());
        return singletons;
    }

 }
