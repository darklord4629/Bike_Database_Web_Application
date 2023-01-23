package com.js.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (value="/passwordlogin")
public class PasswordLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(Integer.parseInt(req.getParameter("password"))==123) {
			req.getRequestDispatcher("homepage.html").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Wrong Password");
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		}
	
	}
}
