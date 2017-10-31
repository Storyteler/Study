package cn.shuoshuge.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		if("fzf".equals(username) && "844".equals(password)) {
			System.out.println("√‹¬Î’˝»∑");
			resp.sendRedirect("home.jsp");
		} else {
			resp.sendRedirect("index.jsp?error=110");
		}
		
	}

}
