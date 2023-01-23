package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BikeCRUD;
import com.js.dto.Bike;
@WebServlet (value="/insert")
public class InsertBike extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bike b=new Bike();
		b.setBid(Integer.parseInt(req.getParameter("bid")));
		b.setModelname(req.getParameter("name"));
		b.setCc(Integer.parseInt(req.getParameter("cc")));
		b.setPrice(Double.parseDouble(req.getParameter("price")));
		
		BikeCRUD bc=new BikeCRUD();
		if(bc.insertBike(b)>0) {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "Done!!");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "Bitch!!\nSomething's Wrong");
			rd.forward(req, resp);
		}
	}
}
