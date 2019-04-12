package com.simple;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filt implements javax.servlet.Filter {

	static int count = 1;
	@Override
	public void destroy() {
		 /* count++;
		  System.out.println("count is "+count);
		// TODO Auto-generated method stub
*/
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		/* System.out.println("getServerName() "+arg0.getServerName());
		 System.out.println("getServerPort "+arg0.getServerPort());
		 System.out.println("getRemotePort "+arg0.getRemotePort());
		 System.out.println("getRemoteHost "+arg0.getRemoteHost());
		 System.out.println("getProtocol()" +arg0.getProtocol());
		 System.out.println("LocalPort "+arg0.getLocalPort());
		 System.out.println("LocalName "+arg0.getLocalName());
		 System.out.println("getLocalAddr "+arg0.getLocalAddr());
		 System.out.println("getRemoteAddr "+arg0.getRemoteAddr());*/
		 
		
		/*String driver = "org.apache.derby.jdbc.ClientDriver";
		Connection connection;
		try {
//			Circle circle = null;
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
//			PreparedStatement ps = connection.prepareStatement("select * from Circle where id=?");
			PreparedStatement ps = connection.prepareStatement("insert into Circle values(?,?)");
			ps.setInt(1, count);
			ps.setString(2, "big"+count);

//			ResultSet resultSet = ps.executeQuery();
			 int executeUpdate = ps.executeUpdate();
			 System.out.println(executeUpdate);
			if (resultSet.next()) {
				System.out.println("circle name is "+resultSet.getString("name"));
				circle = new Circle(resultSet.getString("name"), 1);
			}
//			resultSet.close();
			ps.close();
			System.out.println("in doFilter");
			arg0.setCharacterEncoding("UTF-8");
			arg2.doFilter(arg0, arg1);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
