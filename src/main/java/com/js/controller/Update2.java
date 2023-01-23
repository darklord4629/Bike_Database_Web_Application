package com.js.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BikeCRUD;
import com.js.dto.Bike;
@WebServlet (value="/update2")
public class Update2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bike b=new Bike();
		b.setBid(Integer.parseInt(req.getParameter("bid")));
		b.setModelname(req.getParameter("name"));
		b.setCc(Integer.parseInt(req.getParameter("cc")));
		b.setPrice(Double.parseDouble(req.getParameter("price")));
		
		BikeCRUD bc=new BikeCRUD();
		if(bc.updateBike(b.getBid(), b)>0) {
			req.getRequestDispatcher("viewall").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Failed To Update");
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		}
	}

}
