package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DataDao;
import model.Userdata;

public class GetData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid = Integer.parseInt(request.getParameter("uid"));
		DataDao da = new DataDao();
		if(da.checkId(uid)) {
			Userdata uda = da.getData(uid);
			request.setAttribute("data", uda);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
