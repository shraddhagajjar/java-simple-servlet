/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author shraddha
 */
@WebServlet(urlPatterns = {"/Regi"})

public class Regi extends HttpServlet {
 
  private String message;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Shraddha Gajjar";

  }

  public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
  { 
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h3>Enter Your Details</h3>");
    out.println("<form method=\"post\" action=" +
      "Regi>");
    out.println("<p>First Name : <input type=\"text\" name=\"FirstName\"> </p>");
    
    out.println("<p>Last Name : <input type=\"text\" name=\"LastName\"> </p>");
    
    out.println("<p> Gender: <select size=\"1\" name=\"Gender\"> </p>");
    
    out.println("<option value=\"Female\">Female</option>");
    
    out.println("<option value=\"Male\">Male</option>");
    
    out.println("</select>");
    out.println("<p>Telephone : <input type=\"text\" name=\"Teleno\">");
    
    out.println("<p>Email ID  : <input type=\"text\" name=\"Email\">");
    

    out.println("<p><input type=\"submit\" value=\"Submit\" >");
    out.println("<input type=\"reset\" value=\"Reset\"></p>");
    out.println("</form>");
    out.close(); // Close stream
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse
      response) throws ServletException, IOException {
    response.setContentType("text/html");
    
    PrintWriter out = response.getWriter();
    
    String lastName = request.getParameter("LastName");
    String firstName = request.getParameter("FirstName");
    String gender = request.getParameter("Gender");
    String telephone =  request.getParameter("Teleno");
    String email = request.getParameter("Email");
    
    if (lastName.length() == 0 || firstName.length() == 0) {
      out.println("Last Name and First Name are required");
      return; // End the method
    }
    
    Regiclass r = new Regiclass(lastName, firstName, gender, telephone, email);
    try{
        ObjectOutputStream outFile = new ObjectOutputStream(new FileOutputStream("Regidata.dat"));
        outFile.writeObject(r);
        outFile.close();
    } catch(Exception e){
        System.out.println(e);
    }
    
    try{
        
        ObjectInputStream inFile = new ObjectInputStream(new FileInputStream("Regidata.dat"));
        Regiclass regiin = (Regiclass)inFile.readObject();
    out.println("You entered the following data");
    out.println("<p>Last name: " + regiin.getLastname());
    out.println("<br>First name: " + regiin.getFirstname());
    out.println("<br>Gender: " + regiin.getGender());
    out.println("<br>Telephone: " + regiin.getTelephone());
    out.println("<br>Email: " + regiin.getEamil());
    } catch(Exception e){
        System.out.println(e);
    }
    

  }

  public void destroy()
  {
      // do nothing.
  }
}
