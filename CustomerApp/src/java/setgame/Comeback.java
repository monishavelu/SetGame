package setgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import javax.sql.DataSource;
import javax.ws.rs.core.MediaType;

@WebServlet("/Cards/comeback")
public class Comeback extends HttpServlet{

  
    @Override
    protected void doGet (HttpServletRequest req,HttpServletResponse resp)
            throws ServletException,IOException {
         
        resp.setContentType(MediaType.APPLICATION_JSON);
        resp.setStatus(HttpServletResponse.SC_OK);
        PrintWriter pw = resp.getWriter();
        
      int a,b,c;
      a=Integer.parseInt(req.getParameter("id1"));
      b=Integer.parseInt(req.getParameter("id2"));
      c=Integer.parseInt(req.getParameter("id3"));
     
              Cards d = new Cards();
              d= d.getCard(a);
              Cards e =new Cards();
              e = e.getCard(b);
              Cards f = new Cards(); 
              f = f.getCard(c);
      if(GameEngine.Compare(d,e,f))
      {
          JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("Result","true"); 
             pw.println(job.build().toString());
      }
      else
      { 
          JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("Result","false");
            pw.println(job.build().toString());
      }
}
}
