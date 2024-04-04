package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DataDao;
import model.Userdata;

public class GetDatabase extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Userdata> userList = new ArrayList<>();
		DataDao dao = new DataDao();
		userList = dao.getAllData();
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html>\n"
				+ "<html>\n"
				+ "<head>\n"
				+ "<link rel=\"stylesheet\" href=\"style.css\"/>\n"
				+ "    <meta charset=\"UTF-8\">\n"
				+ "    <title>Display Users</title>\n"
				+ "    <style>\n"
				+ "        table {\n"
				+ "            border-collapse: collapse;\n"
				+ "            width: 50%;\n"
				+ "            margin: 20px auto;\n"
				+ "        }\n"
				+ "        th, td {\n"
				+ "            border: 1px solid #dddddd;\n"
				+ "            text-align: left;\n"
				+ "            padding: 8px;\n"
				+ "        }\n"
				+ "        th {\n"
				+ "            background-color: #f2f2f2;\n"
				+ "        }\n"
				+ "    </style>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<div class=\"login-wrap\">\n"
				+ "<div class=\"login-html\">\n"
				+ "    <h2 class=\"group\">User List</h2>\n"
				+ "    <table class=\"group\">\n"
				+ "        <tr>\n"
				+ "            <th>User ID</th>\n"
				+ "            <th>Username</th>\n"
				+ "            <th>Password</th>\n"
				+ "        </tr>");
		for(Userdata ud : userList) {
			out.println("            <tr>\n"
					+ "                <td>"+ud.getUserId()+"</td>\n"
					+ "                <td>"+ud.getUserName()+"</td>\n"
					+ "                <td>"+ud.getUserPassword()+"</td>\n"
					+ "            </tr>");
			
		}
		out.println( "    </table>\n"
				+ "</div>\n"
				+ "</div>\n"
				+ "</body>\n"
				+ "</html>");
//		request.setAttribute("userList", userList);
//		request.getRequestDispatcher("showAllData.jsp").forward(request, response);
	}

}
