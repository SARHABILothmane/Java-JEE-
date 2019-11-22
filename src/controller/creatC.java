package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entite.client;
import entite.compte;
import module.clientDao;
import module.compteDao;

/**
 * Servlet implementation class creatC
 */
@WebServlet("/creatC")
public class creatC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creatC() {
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
		String nomC = request.getParameter("namC");
		String prenomC = request.getParameter("prenomC");
		int cin =  Integer.parseInt(request.getParameter("cin"));
		int compteId =  Integer.parseInt(request.getParameter("compteId"));
		compteDao dao = new compteDao();
		
		compte compte = new compte(compteId);
		
		client client = new client(nomC, prenomC, cin, compte); 
		clientDao.insertU(client);
		
		response.sendRedirect("selectAllClient");
	}

}
