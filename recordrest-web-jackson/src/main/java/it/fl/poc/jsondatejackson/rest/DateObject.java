package it.fl.poc.jsondatejackson.rest;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

// import javax.json.bind.annotation.JsonbDateFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
// import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class DateObject implements Serializable {
    private static final String CLASS_NAME = DateObject.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);
    private static final long serialVersionUID = 1L;
    
    // @JsonSerialize(as = java.util.Date.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "America/Chicago")
    private Date date;

    // @JsonSerialize(as = java.util.Date.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "America/Chicago")
    // @JsonbDateFormat(value = "dd/MM/yyyy")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

