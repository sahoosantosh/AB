package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if("santosh".equals(uname)&&"maven".equals(pwd))
		{
			pw.println("<h1>login sucess</h1>");
		}
		else
		{
			pw.println("<h1>login failed</h1>");
		}
		pw.close();
	}

}
