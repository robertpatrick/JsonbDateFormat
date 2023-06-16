package it.fl.poc.jsondate.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.*;

/*
 * [Managing Entities](https://javaee.github.io/tutorial/persistence-intro004.html)
 * [EclipseLink/Examples/JPA/WebLogic Web Tutorial - Eclipsepedia](https://wiki.eclipse.org/EclipseLink/Examples/JPA/WebLogic_Web_Tutorial)
 * https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/ejbad/using_toplink.html#GUID-9BC674DF-7DF1-413C-91AC-667315E45610
 * [JPA Named Query Example - Examples Java Code Geeks - 2023](https://examples.javacodegeeks.com/java-development/enterprise-java/jpa-named-query-example/)
 */

@Entity
@Table(name = "APP_TABLE2")
@NamedQuery(name = "Record.findAll", query = "SELECT r FROM Record r")
@NamedQuery(name = "Record.findById", query = "SELECT r FROM Record r WHERE r.id = :id")
public class Record implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(" it.fl.poc.jsondate.entities.Record");

    @Id
    private String id;

    @Column(name = "DATE_AS_TIMESTAMP")
    private Timestamp dateAsTimestamp;

    @Temporal(value=TemporalType.DATE)
    @Column(name = "DATE_AS_DATE")
    private Date dateAsDate;

    @Column(name = "TIMESTAMP_AS_TIMESTAMP")
    private Timestamp timestampAsTimestamp;

    // public Record(String id) {
    // this.setId(id);
    // this.setTimestamp(new Timestamp(System.currentTimeMillis()));
    // Calendar c = new GregorianCalendar();
    // c.set(Calendar.HOUR_OF_DAY, 0); // anything 0 - 23
    // c.set(Calendar.MINUTE, 0);
    // c.set(Calendar.SECOND, 0);
    // c.set(Calendar.MILLISECOND, 0);
    // c.setTimeZone(TimeZone.getTimeZone("UTC"));
    // this.setDate(new Timestamp((c.getTime()).getTime()));
    // System.err.println("Timestamp: " + this.timestamp);
    // System.err.println("Date: " + this.date);
    // }

    public Timestamp getTimestampAsTimestamp() {
        logger.info("getTimestampAsTimestamp() - ENTERING");
        return timestampAsTimestamp;
    }

    public void setTimestampAsTimestamp(Timestamp timestampAsTimestamp) {
        logger.info("setTimestampAsTimestamp() - ENTERING");
        this.timestampAsTimestamp = timestampAsTimestamp;
    }

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
    public Timestamp getDateAsTimestamp() {
        logger.info("getDateAsTimestamp() - ENTERING");
        if (logger.isLoggable(Level.FINE)) {
            try {
                throw new Exception("getDateAsTimestamp exception for debuggging.");
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace(System.err);
            }
        }
        return dateAsTimestamp;
    }

    public void setDateAsTimestamp(Timestamp timestamp) {
        logger.info("setDateAsTimestamp() - ENTERING");
        this.dateAsTimestamp = timestamp;
    }

    public void setDateAsDate(Date adate) {
        logger.info("setDateAsDate() - ENTERING");
        this.dateAsDate = adate;
    }

    @Temporal(value=TemporalType.DATE)
    public Date getDateAsDate() {
        logger.info("getDateAsDate() - ENTERING");
        try {
            throw new Exception("getDateAsDate exception for debuggging.");
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace(System.err);
        }
        return dateAsDate;
    }
}
