package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import entite.compte;
import module.compteDao;

/**
 * Servlet implementation class modifierCompte
 */
@WebServlet("/modifierC")
public class modifierCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifierCompte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid =  Integer.parseInt(request.getParameter("id"));
    	compteDao db = new compteDao();
    	compte D1 = db.selectId(cid);
		request.setAttribute("UP", D1);
		this.getServletContext().getRequestDispatcher("/updateCompte.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("hhhhhhhhhhh");
		int iid =  Integer.parseInt(request.getParameter("ed"));
		int num =  Integer.parseInt(request.getParameter("numC"));
		int sold =  Integer.parseInt(request.getParameter("soldC"));
		compte up = new compte(iid, num, sold);

		compteDao db = new compteDao();
		db.update(up);
    response.sendRedirect("showAll");
 

	
	}

}
