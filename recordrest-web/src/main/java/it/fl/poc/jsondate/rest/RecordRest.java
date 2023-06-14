package it.fl.poc.jsondate.rest;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import it.fl.poc.jsondate.entities.Record;

@Stateless
@Path("/record")
@Produces(MediaType.APPLICATION_JSON)
public class RecordRest {
 
    @PersistenceContext(unitName = "RecordJPA")
    private EntityManager em;
    private final Logger logger = Logger.getLogger("RecordRest");
  
    // public RecordRest(){
    //     logger.info("Constructor");
    //     if (em != null){
    //         logger.info("EntityManager: " + em);
    //     } else {
    //         logger.severe("EntityManager: NULL");
    //     }
    // }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Record> getAllRecords(){
        List<Record> entityList = new Vector<Record>();
        if (em != null){
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
    public Record getRecord(@PathParam("record") int id){
            TypedQuery<Record> query = em.createNamedQuery("Record.get", Record.class);
            List<Record> entityList = query.setParameter("id", id).getResultList();
            return entityList.get(0);
    }
    
    @GET
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public String ping(){
        return "pong";
    }
}
