/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author A0136582b
 */
@WebServlet("/Cards/two")
public class SetJsontwo  extends HttpServlet{
    @Override
    protected void doGet (HttpServletRequest req,HttpServletResponse resp)
            throws ServletException,IOException {
        
        JsonArray js = null;
        JsonArrayBuilder builder = Json.createArrayBuilder();
        PrintWriter pw =  resp.getWriter();
       
     
       ArrayList<Cards> Balance =  SetCheck.Cardstobesolved;
       ArrayList<Cards> Replacement = new ArrayList<>();
           Replacement.add(0,Balance.remove(0));
            Replacement.add(1,Balance.remove(1));
             Replacement.add(2,Balance.remove(2));
             
       for (Cards c: Replacement)
        {
            JsonObjectBuilder jobj = Json.createObjectBuilder();
            jobj.add("img_url","cards/"+c.getHashkey()+".gif");
            jobj.add("img_id",c.getHashkey().toString());
            builder.add(jobj.build());
        }
        pw.println((builder.build().toString()));
    }
    
}

