package it.fl.poc.jsondatejackson.rest.application;

import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import it.fl.poc.jsondatejackson.rest.DateDemoService;

@ApplicationPath("/resources")
public class JaxRsWithJacksonApplication extends ResourceConfig {
    private static final String CLASS_NAME = JaxRsWithJacksonApplication.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);

    public JaxRsWithJacksonApplication() {
        logger.info("@FL JaxRsWithJacksonApplication()");
        register(JacksonFeature.class);
        register(JacksonJsonProvider.class);
        register(DateDemoService.class);
    }
}

