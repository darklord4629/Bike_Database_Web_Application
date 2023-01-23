package com.js.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BikeCRUD;
import com.js.dto.Bike;

@WebServlet (value="/update")
public class Update1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BikeCRUD bc=new BikeCRUD();
		Bike b=bc.getBikeByID(Integer.parseInt(req.getParameter("bid")));
		if(b==null) {
			req.setAttribute("msg", "Failed to Update");
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("Bike", b);
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}
}
