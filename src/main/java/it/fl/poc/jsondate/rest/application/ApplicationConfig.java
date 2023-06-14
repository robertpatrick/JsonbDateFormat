package it.fl.poc.jsondate.rest.application;

import java.util.Set;

import javax.ws.rs.ApplicationPath;

import it.fl.poc.jsondate.rest.RecordRest;

@ApplicationPath("/app")
public class ApplicationConfig {
    public Set<Class<?>> getClasses(){
        return getRestClasses();
    }

    private Set<Class<?>> getRestClasses(){
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(RecordRest.class);
        return resources;
    }
}
