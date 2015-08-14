/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.annotation.Resource;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author A0136582b
 */
@WebServlet("/Cards")
public class SetJSon extends HttpServlet{
    
   
    
    @Override
    protected void doGet (HttpServletRequest req,HttpServletResponse resp)
            throws ServletException,IOException {
   
           
        JsonArray js = null;
        resp.setContentType(MediaType.APPLICATION_JSON);
        resp.setStatus(HttpServletResponse.SC_OK);
        ArrayList<Cards> twelve = SetCheck.CardsOnTableMethod();
        JsonArrayBuilder builder = Json.createArrayBuilder();
        PrintWriter pw =  resp.getWriter();
        for (Cards c: twelve)
        {
            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("img_url","cards/"+c.getHashkey()+".gif");
            job.add("img_id",c.getHashkey().toString());
            builder.add(job.build());
        }
        pw.println((builder.build().toString())); 
    }
    
}
