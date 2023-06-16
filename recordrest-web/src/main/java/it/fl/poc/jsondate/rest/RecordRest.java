package it.fl.poc.jsondate.rest;

import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import it.fl.poc.jsondate.entities.Record;

/*
 * [Developing RESTful Web Services](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/restf/develop-restful-service.html#GUID-E8C81B8C-9EF2-48CE-8537-6958EDDF6B51)
 * [jakarta ee - EJB injection into JAX-RS not working - Stack Overflow](https://stackoverflow.com/questions/10872328/ejb-injection-into-jax-rs-not-working)
 * [25.1 Packaging CDI Applications - Java Platform, Enterprise Edition: The Java EE Tutorial (Release 7)](https://docs.oracle.com/javaee/7/tutorial/cdi-adv001.htm)
 */

@Stateless
@LocalBean
@Path("/record")
@Produces(MediaType.APPLICATION_JSON)
public class RecordRest {
    private static final Logger logger = Logger.getLogger("RecordRest");
    
    @PersistenceContext(unitName = "RecordJPA")
    private EntityManager em;

    public RecordRest() {
        logger.info("<init> - ENTERING");
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Record> getAllRecords() {
        logger.info("getAllRecords() - ENTERING");
        List<Record> entityList = new Vector<Record>();
        if (em != null) {
            logger.info("EntityManager: " + em);
            TypedQuery<Record> query = em.createNamedQuery("Record.findAll", Record.class);
            entityList = query.getResultList();
        } else {
            logger.severe("EntityManager: NULL");
        }
        return entityList;
    }

    @GET
    @Path("{record}")
    public Record getRecord(@PathParam("record") String id) {
        logger.info("getRecord() - ENTERING");
        TypedQuery<Record> query = em.createNamedQuery("Record.findById", Record.class);
        List<Record> entityList = query.setParameter("id", id).getResultList();
        return entityList.get(0);
    }

    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public String ping() {
        return "pong";
    }
    

    // curl -x '' -X POST http://localhost:7001/recordrest-web/resources/record/add
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Record addRecord(){
        logger.info("populate() - ENTERING");
        Record r1 = new Record();
        java.util.Date d = new java.util.Date();
        r1.setId(String.valueOf(d.getTime()));
        r1.setDateAsDate(d);
        r1.setDateAsTimestamp(new java.sql.Timestamp(d.getTime()));
        r1.setTimestampAsTimestamp(new java.sql.Timestamp(d.getTime()));
        em.persist(r1);
        return r1;
    }
    
}
