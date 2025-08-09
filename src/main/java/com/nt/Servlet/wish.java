package com.nt.Servlet;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/wish")
public class wish extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{       
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   pw.println("<h1 style='color:red;text-align:center'>Hello World</h1>");
	   pw.println("<br><br><a href='index.jsp'>home</a>");
	   pw.close();
	   
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    doGet(req, res);
	}

}
