
package com.uwefuchs.demo.soap.apachecxf.endpoint;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2018-10-02T20:35:30.557+02:00
 * Generated source version: 3.1.16
 * 
 */
 
public class Baeldung_BaeldungPort_Server{

    protected Baeldung_BaeldungPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BaeldungPortImpl();
        String address = "http://localhost:8080/my-first-cxf-springmvc/services/baeldung";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Baeldung_BaeldungPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
