package com.nc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register.html")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Profile profile = new Profile();
		profile.setFirstName(request.getParameter("fname"));
		profile.setLastName(request.getParameter("lname"));
		profile.setPassword(request.getParameter("pwd"));
		profile.setUsername(request.getParameter("uname"));
		if(request.getParameter("gender")!=null) {
			profile.setGender(request.getParameter("gender"));
		}
		if(request.getParameterValues("hobby")!=null) {
			profile.setHobbies(String.join(",", request.getParameterValues("hobby")));
		}
		if(! request.getParameter("country").equals("")) {
			profile.setCountry(request.getParameter("country"));
		}
		
		//validations
		List<String> errs = new ArrayList<String>();
		if(profile.getPassword().length()<8) {
			errs.add("Password length must be 8 or more");
		}
		if(profile.getUsername().length()<6) {
			errs.add("Username length must be 6 or more");
		}
		String path = "";
		//redirection or dispatch
		if(errs.size()>0) {
			//error
			path = "index.jsp";
			request.setAttribute("errs", errs);
		}
		else {
			//success
			path = "profile.jsp";
			request.setAttribute("profile", profile);
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
