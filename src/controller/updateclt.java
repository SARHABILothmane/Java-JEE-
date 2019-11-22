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

/**
 * Servlet implementation class updateclt
 */
@WebServlet("/updateclt")
public class updateclt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateclt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clientDao clt2 = new clientDao();
		int lid = Integer.parseInt(request.getParameter("id"));
       client c = clt2.selectIdclt(lid);
       System.out.println("noooooo");
       request.setAttribute("cltup" ,c);
       this.getServletContext().getRequestDispatcher("/updateCompteClt.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clientDao clt1 = new clientDao();
		int id = Integer.parseInt(request.getParameter("eed"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int cin = Integer.parseInt(request.getParameter("cin"));
		int compt_id = Integer.parseInt(request.getParameter("compt_id"));
		compte com = new compte(compt_id);
		client clt = new client(id, nom, prenom, cin, com);
		System.out.println(clt);
		clt1.updateclt(clt);
		response.sendRedirect("selectAllClient");
	}

}
