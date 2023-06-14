package it.fl.poc.jsondate.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

import javax.persistence.*;

/*
 * https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/ejbad/using_toplink.html#GUID-9BC674DF-7DF1-413C-91AC-667315E45610
 */

@Entity
@Table(name="APP_TABLE2")
@NamedQuery(name="Record.findAll", query="SELECT r FROM Record r")
@NamedQuery(name="Record.findById", query="SELECT r FROM Record r WHERE r.id == :id")
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(" it.fl.poc.jsondate.entities.Record");


    private String id;
    private Timestamp timestamp;
    private Date adate;

    // public Record(String id) {
    //     this.setId(id);
    //     this.setTimestamp(new Timestamp(System.currentTimeMillis()));
    //     Calendar c = new GregorianCalendar();
    //     c.set(Calendar.HOUR_OF_DAY, 0); // anything 0 - 23
    //     c.set(Calendar.MINUTE, 0);
    //     c.set(Calendar.SECOND, 0);
    //     c.set(Calendar.MILLISECOND, 0);
    //     c.setTimeZone(TimeZone.getTimeZone("UTC"));
    //     this.setDate(new Timestamp((c.getTime()).getTime()));
    //     System.err.println("Timestamp: " + this.timestamp);
    //     System.err.println("Date: " + this.date);
    // }


    @Id
    public String getId() {
        logger.info("getID() - ENTERING");
        return id;
    }

    public void setId(String id) {
        logger.info("setID() - ENTERING");
        this.id = id;
    }

    // @JsonSerialize(using = JacksonTimestampSerializer.class)
    // @JsonDeserialize(using = JacksonTimestampDeserializer.class)
    public Timestamp getTimestamp() {
        logger.info("getTimestamp() - ENTERING");
        try {
            throw new Exception("getTimestamp exception for debuggging.");
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
        }
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        logger.info("setTimestamp() - ENTERING");
        this.timestamp = timestamp;
    }

    public void setAdate(Timestamp adate) {
        logger.info("setAdate() - ENTERING");
        this.adate = adate;
    }

    public Date getAdate() {
        logger.info("getAdate() - ENTERING");
        try {
            throw new Exception("getDate exception for debuggging.");
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
        }
        return adate;
    }

}
