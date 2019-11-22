package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entite.users;
import module.autentificationBq;

/**
 * Servlet implementation class verfierLogin
 */
@WebServlet("/verfierLogin")
public class verfierLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verfierLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
       ses.invalidate();
       response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	autentificationBq userbq = new autentificationBq();
	users admin = new users(name,email, password);
	System.out.println(admin);
	users admin2 = userbq.checkin(admin);
	
	if (admin2.getValide() == true){
//		session.setAttribute("admi", admin2);
		response.sendRedirect("index.html");
		
	}else{
		response.sendRedirect("login.html");
		
	}
	}

}
