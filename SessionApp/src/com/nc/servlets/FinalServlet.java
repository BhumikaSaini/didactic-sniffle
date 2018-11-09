package com.nc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FinalServlet
 */
@WebServlet("/final.html")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//String fname = request.getParameter("fname");
		//Cookie[] cookies = request.getCookies();
		//String fname="";
		/*for(Cookie ck:cookies)
		{
			if(ck.getName().equals("fname"))
			{
				fname=ck.getValue();
			}
		}*/
		String fname="";
		HttpSession session = request.getSession();
		fname=(String)session.getAttribute("fname");
		String lname = request.getParameter("lname");
		
		response.setContentType("text/html");
		String msg = "<h2>"+fname+" "+lname+" "+"</h2>";
		response.getWriter().println(msg);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
