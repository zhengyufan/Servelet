package com.servlet.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDispatcher
 */
@WebServlet("/test-dispatcher")
public class TestDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if( request.getParameter("firstname") == null || request.getParameter("lastname") == null ){
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		response.getWriter().println("Hello " + firstname + " " + lastname + "!");

	}

}
