package it.fl.poc.jsondatejackson.rest.application;

import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import javax.ws.rs.*;
import javax.ws.rs.ext.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.core.*;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper> {
 	private final ObjectMapper mapper = new ObjectMapper();
    private static final String CLASS_NAME = "it.fl.poc.jsondatejackson.rest.application.JacksonConfig";
    private static final Logger logger = Logger.getLogger(CLASS_NAME);

     public JacksonConfig() {
        logger.info("@FL JacksonConfig()");
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
         mapper.setDateFormat(dateFormat);
     }

     @Override
     public ObjectMapper getContext(Class<?> clazz) {
        logger.info("@FL getContext(..)");
         return mapper;
     }
 }
