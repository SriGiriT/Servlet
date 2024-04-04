package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DataDao;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		DataDao rs = new DataDao();
		if(username!=null && password != null && !username.isEmpty() && !password.isEmpty()) {
			if(rs.saveDatatoDB(username, password)) {
				response.sendRedirect("login.jsp");
			}else {
				response.sendRedirect("login.jsp");
			}
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
