package it.fl.poc.jsondate.utils;

 
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;


/**
* 
* @author BK001344
* 
* Created to avoid NullPointerException if Timestamp instance is null
* 
*/
public class JacksonTimestampDeserializer extends StdScalarDeserializer<Timestamp> {
    public JacksonTimestampDeserializer() { super(Timestamp.class); }

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private boolean isEmpty(String value){
        return value == null || "".equals(value.trim());
    }

    @Override
    public Timestamp deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        Date date = null;
        try {
            if(!isEmpty(jp.getText())) date = formatter.parse(jp.getText().trim());
            System.err.println("deserialize() date - " + date);
            System.err.println("deserialize() jp - " + jp.getText());
        } catch(ParseException e) {
            e.printStackTrace();
        } 
        return (date == null) ? null : new Timestamp(date.getTime());
    }
}