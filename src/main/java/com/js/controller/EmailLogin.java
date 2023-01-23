package com.js.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (value="/emaillogin")
public class EmailLogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("email").equals("abc@gmail.com")|| req.getParameter("email").equals("yadavshashank9108@gmail.com")) {
			req.setAttribute("emailname",(String) req.getParameter("email"));
			req.getRequestDispatcher("passwordlogin.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Wrong Email");
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		}
	}
}
