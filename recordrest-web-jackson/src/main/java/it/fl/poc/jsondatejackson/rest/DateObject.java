package it.fl.poc.jsondatejackson.rest;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DateObject implements Serializable {
    private static final String CLASS_NAME = DateObject.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);
    private static final long serialVersionUID = 1L;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

