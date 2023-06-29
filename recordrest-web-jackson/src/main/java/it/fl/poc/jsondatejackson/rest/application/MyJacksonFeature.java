package it.fl.poc.jsondatejackson.rest.application;

import java.util.logging.Logger;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.CommonProperties;

public class MyJacksonFeature implements Feature {
    private static final String CLASS_NAME = "it.fl.poc.jsondatejackson.rest.application.JacksonFeature";
    private static final Logger logger = Logger.getLogger(CLASS_NAME);
    
    @Override
    public boolean configure(FeatureContext context) {
        logger.info("@FL configure() - ENTERING");
 		final String disableMoxy = CommonProperties.MOXY_JSON_FEATURE_DISABLE + '.' + context.getConfiguration().getRuntimeType().name().toLowerCase();
 		context.property(disableMoxy, true);
 		context.register(JacksonJaxbJsonProvider.class, MessageBodyReader.class, MessageBodyWriter.class);
 		return true;
 	}
}