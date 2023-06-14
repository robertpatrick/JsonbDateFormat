package it.fl.poc.jsondate.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyBean {
    public String ping(){
        return "pong";
    }
}
