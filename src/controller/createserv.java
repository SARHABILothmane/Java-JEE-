package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entite.compte;
import module.compteDao;

/**
 * Servlet implementation class createserv
 */
@WebServlet("/createserv")
public class createserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numCompte =  Integer.parseInt(request.getParameter("numCompte"));
		int soldCompte =  Integer.parseInt(request.getParameter("soldCompte"));
		compte c1 = new compte(numCompte, soldCompte);
		compteDao.insert(c1);
		response.sendRedirect("showAll");
//		request.setAttribute("numCompte", numCompte);
//		request.setAttribute("soldCompte", soldCompte);
//		this.getServletContext().getRequestDispatcher("/ajoute.jsp").forward(request, response);
	}

}
