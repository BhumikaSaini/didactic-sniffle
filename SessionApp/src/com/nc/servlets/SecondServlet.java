package com.nc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/second.html")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text.html");
		String fname = request.getParameter("fname");
		//using session obj for session mgmnt
		HttpSession session = request.getSession();
		session.setAttribute("fname", fname);
		//using cookies for session mgmnt
		/*Cookie fnck = new Cookie("fname", fname);
		fnck.setMaxAge(5*60);
		response.addCookie(fnck);*/
		out.println("<b>Enter your last name:</b>");
		out.println("<form action='final.html'>");
		//using hidden field below for session mgmnt
		//out.println("<input type='hidden' name='fname' value='"+fname+"'/>");
		//using url rewriting for session mgmnt
		//out.println("<form method='post' action='final.html?fname="+fname+"'>");
		out.println("<input type='text' name='lname'/>");
		out.println("<input type='submit' value='Submit'/>");
		out.println("</form>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
