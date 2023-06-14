import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.annotation.JsonbDateFormat;

import org.junit.jupiter.api.Test;
import java.util.logging.*;

public class ParseDateTest {

    public static Logger LOGGER = Logger.getLogger("ParseDateTest");

    //@Test
    public void notestDate() {
        LOGGER.setLevel(Level.INFO);
        String json = "{\"date\":\"2018-03-05\"}";
        Jsonb jsonb = JsonbBuilder.create();

        Form form = jsonb.fromJson(json, Form.class);

        System.out.println("date:" + form.getDate());

    }

    public static class Form {

        @JsonbDateFormat(value = "yyyy-MM-dd")
        private Date date;

    public Date getDate() {
        System.out.println("getDate(): " + date.toString());
        return date;
    }

    public void setDate(Date date) {
        System.out.println("setDate(): " + date.toString());
        this.date = date;
    }

    }

}