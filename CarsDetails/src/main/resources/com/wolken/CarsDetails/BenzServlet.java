package com.wolken.CarsDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BenzServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>")
		writer.println("<title>BMW cars</title>");
		writer.println("</head>")
		writer.println("<body>Mercedes, is a German luxury automotive brand.BMW cars price in India starts at Rs. 39.50 Lakh for X1 and goes upto "
				+ "Rs. 2.46 Crore for 7 Series. In total BMW sells 18 new car models powered by "
				+"Petrol Engines and Diesel Engines along with automatic transmission options."
				+"BMW X1 is among the popular.");
				
		writer.println("</head>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
}