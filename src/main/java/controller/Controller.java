package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DataDao;
import model.Userdata;

public class Controller extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		int uid = Integer.parseInt(request.getParameter("uid"));
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		DataDao dao = new DataDao();
		if(dao.checkUser(uname, upass)) {
			request.setAttribute("data", uname);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
