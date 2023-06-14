package it.fl.poc.jsondate.utils;
 

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

 

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
/**
* 
* @author BK001344
* 
*/
public class JacksonTimestampSerializer extends JsonSerializer<Timestamp> {
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void serialize(Timestamp value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(formatter.format(value));
    }
}