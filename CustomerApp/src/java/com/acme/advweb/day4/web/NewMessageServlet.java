/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.advweb.day4.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.media.sse.OutboundEvent;

/**
 *
 * @author A0136582b
 */
@WebServlet("/newMessage")
public class NewMessageServlet extends HttpServlet {
     
        @Inject private ParticipantList participants;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      String name = req.getParameter("name");
      String msg = req.getParameter("message");
      
       // System.out.println(name +">>"+msg);
        
        JsonObject json = Json.createObjectBuilder()
                .add("name",name)
                .add("message",msg)
                .build();
        
        
        OutboundEvent data  = new OutboundEvent.Builder()
                .data(JsonObject.class,json)
                .mediaType(MediaType.APPLICATION_JSON_TYPE)
                .build();
        
      //  System.out.println(data.getData().toString());
      
        participants.send(data);
        
      resp.setStatus(HttpServletResponse.SC_OK);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
