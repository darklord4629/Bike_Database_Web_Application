package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BikeCRUD;
import com.js.dto.Bike;
@WebServlet (value="/viewall")
public class ViewAllBike extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BikeCRUD bc=new BikeCRUD();
		ArrayList<Bike> al = bc.viewAll();
		
		if(al==null) {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "There are no Bikes To Display");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("viewall.jsp");
			req.setAttribute("data",al);
			rd.forward(req, resp);
		}
	}
}
