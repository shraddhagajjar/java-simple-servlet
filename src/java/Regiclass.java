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

/**
 *
 * @author shraddha
 */
@WebServlet(urlPatterns = {"/Regiclass"})
public class Regiclass extends HttpServlet {

    private String lastname;
    private String firstname;
    private String gender;
    private String telephone;
    private String eamil;
    
    public Regiclass(String lastname, String firstname, String gender, String telephone, String eamil) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
        this.telephone = telephone;
        this.eamil = eamil;
    }

    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getTelephone() {
        return telephone;
    }
    public String getEamil() {
        return eamil;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
}
