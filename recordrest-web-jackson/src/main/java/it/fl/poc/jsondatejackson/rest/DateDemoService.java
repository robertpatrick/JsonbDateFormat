package it.fl.poc.jsondatejackson.rest;

import java.util.Date;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/datedemo")
public class DateDemoService {
  private static final String CLASS_NAME = DateDemoService.class.getName();
  private static final Logger logger = Logger.getLogger(CLASS_NAME);

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Object getDate() {
    DateObject dateObj = new DateObject();
    logger.info("@FL GET Date");
    dateObj.setDate(new Date());
    return dateObj;
  }

}
