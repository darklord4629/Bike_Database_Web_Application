package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BikeCRUD;
@WebServlet (value="/delete")
public class DeleteBike extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BikeCRUD bc=new BikeCRUD();
		if(bc.deleteBike(Integer.parseInt(req.getParameter("bid")))>0) {
			RequestDispatcher rd=req.getRequestDispatcher("viewall");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "Something Went Wrong Bitch!!");
			rd.forward(req, resp);
		}

	}
}
