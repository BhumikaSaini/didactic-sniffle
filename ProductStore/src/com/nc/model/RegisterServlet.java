package com.nc.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register.html")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	public void init(ServletConfig config) throws ServletException {
		context=config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("pname");
	double price = Double.parseDouble(request.getParameter("price"));
	int quantity = Integer.parseInt(request.getParameter("qty"));
	Product newProduct =new Product(name,price,quantity);
	List<Product> plist =(List<Product>) context.getAttribute("plist");
	if(plist==null)
	{
		plist=new ArrayList<>();
	}
	plist.add(newProduct);
	context.setAttribute("plist", plist);
	/*
	RequestDispatcher rd = request.getRequestDispatcher("/display.html");
	//response.getWriter().println("1 product Added");
	request.setAttribute("msg", "1 product added");
	rd.forward(request, response);
	*/
	response.sendRedirect("display.html");
	}

}
