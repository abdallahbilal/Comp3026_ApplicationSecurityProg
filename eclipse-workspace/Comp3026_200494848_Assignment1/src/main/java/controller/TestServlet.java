package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	public static void main(String[] args) {
	    try {
	        Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/userdb",
	            "root",
	            "Password@123"
	        );
	        System.out.println("CONNECTED SUCCESSFULLY");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
