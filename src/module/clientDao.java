package module;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entite.client;
import entite.compte;

public class clientDao {
	//insert
	public static void insertU(client p) {
		Connection con =connectionDB.getconnection();
		try {
			Statement st = con.createStatement();
			System.out.println("Objet statement ok");
	     int r = st.executeUpdate("insert into client(nomClient,prenomClient,cin,compte_id ) values ('"+ p.getNom()+"','"+p.getPrenom()+"','"+p.getCin()+"','"+p.getCompte_id().getId()+"')");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {	
			if(con!=null) {
				connectionDB.disconnect();
			}
		}
	}
//	//select id
public  client selectIdclt(int id) {
	Connection con =connectionDB.getconnection();
	compte comp;
	client clt;
	client c = null;
	try {
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from client where id="+id+"");
	if (rs.next()){
		int ed = rs.getInt("id");
		String nom_clt = rs.getString("nomClient");
	    String prenom_clt = rs.getString("prenomClient");
		int cin_clt = rs.getInt("cin");
		int clt_id = rs.getInt("compte_id");
		compteDao daoc = new compteDao();
		comp = daoc.selectId(clt_id);
	    
	c = new client(ed,nom_clt, prenom_clt, cin_clt, comp);
	
	}
	
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return  c;
	
}
//selctALl
public static ArrayList<client> selectclient(){
	Connection con =connectionDB.getconnection();
	compte compt;
	client clt;
	ArrayList<client> tb= new ArrayList<client>();
	compteDao comptedao = new compteDao();
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from client");
		while (rs.next()) {	
			int id = rs.getInt("id");
			String nom = rs.getString("nomClient");
			String prenom = rs.getString("prenomClient");
			int cin = rs.getInt("cin");
			int compte_id = rs.getInt("compte_id");
			compt = comptedao.selectId(compte_id);
			clt  = new client(id, nom, prenom, cin, compt);
			tb.add(clt);  
			
		}
      }catch (Exception e) {
  		// TODO: handle exception
  		e.printStackTrace();
  	}
	return tb;
 }
//// update
public void updateclt(client p) {
	Connection con =connectionDB.getconnection();	
try {
	
Statement st = con.createStatement();
st.executeUpdate("update client set nomClient='"+p.getNom()+ "', prenomClient='"+p.getPrenom()+"', cin='"+p.getCin()+"', compte_id='"+p.getCompte_id().getId()+"' where id="+p.getId()+"");
System.out.println("la class person est modifier ");
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}finally {	
	if(con!=null) {
		connectionDB.disconnect();
	}
}
}
//delete
public void deleteclt(int s_id) {
	Connection con =connectionDB.getconnection();
try {
	
	Statement st = con.createStatement();
st.executeUpdate("delete from client where id="+s_id+"");
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}finally {	
	if(con!=null) {
		connectionDB.disconnect();
	}
}
}
}
