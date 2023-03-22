package controllers;

import java.io.IOException;

import entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.UserDaoMySql;


@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserDaoMySql dao = new UserDaoMySql();
		User user = new User();
		user.setUserId(1);
		user.setFirstName("yassine");
		user.setLastName("dardouri");
		user.setLogin("chaimae");
		user.setPassword("chaimae123");
		user.setBestScore(12);

		System.out.println(dao.getAllUsers());

		if(request.getSession().getAttribute("isLogged") != null &&
		Boolean.parseBoolean(request.getSession().getAttribute("isLogged").toString())) {
			request.getRequestDispatcher("/WEB-INF/Views/index.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("isLogged", true);
		doGet(request, response);
	}

}
