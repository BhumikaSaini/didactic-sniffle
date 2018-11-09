package com.nc.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class BackgroundFilter
 */
@WebFilter("*.html")
public class BackgroundFilter implements Filter {

    /**
     * Default constructor. 
     */
    public BackgroundFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		//chain.doFilter(request, response);
		
		response.setContentType("text/html");
		//this code ll be processed at request
		PrintWriter out = response.getWriter();
		out.println("<body style='background-color:green'>");
		out.println("<h1 style='text-align: center'>Netcracker</h1>");
		out.println("<hr>");
		
		chain.doFilter(request, response);
		
		//this code ll be processed at response
		out.println("<hr>");
		out.println("<h4 style='text-align: right'>Copyright  Netcracker</h4>");
		out.println("</body>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
