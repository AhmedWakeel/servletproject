package com.simple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns ={"/servlet"})
public class SimpleServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
		String parameter2 = request.getParameter("prof");
		System.out.println("prof is = "+parameter2);
		
		String[] parameterValues = request.getParameterValues("sel");
		
		for(int i = 0; i<parameterValues.length;i++)
		{
			System.out.print(" "+parameterValues[i]);
		}
		
		
		String driver = "org.apache.derby.jdbc.ClientDriver";
		Connection connection;
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			PreparedStatement ps = connection.prepareStatement("select * from Circle where id=?");
			ps.setInt(1, Integer.parseInt(request.getParameter("name")));

			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				System.out.println("circle name is "+resultSet.getString("name"));
			}
			resultSet.close();
			ps.close();
			System.out.println("in doFilter");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		final Writer writer1 = new FileWriter("D:\\zz.txt");
		String name = request.getParameter("name");
		if(name == null)
		System.out.println("name is null");
		writer1.write(name);
		System.out.println("character encode checking "+name);
		
		writer1.close();
		
//    	response.setContentType("");
    	String changeSessionId = request.changeSessionId();
//    	SendMailSSL.send("wakeelmalik123@gmail.com","W213508213508@","wakeelmalik123@hotmail.com","hello javatpoint",request.getParameter("name"));
    	System.out.println(changeSessionId);
//    	request.setCharacterEncoding("UTF-8");
    	String parameter = request.getParameter("name");
    	PrintWriter writer = response.getWriter();
    	writer.println("hi "+parameter+" "+request.getCharacterEncoding());
    }
}
