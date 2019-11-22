package module;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entite.compte;



public class compteDao {
	//insert
	public static void insert(compte p) {
		Connection con =connectionDB.getconnection();
		try {
			Statement st = con.createStatement();
			System.out.println("Objet statement ok");
	     int r = st.executeUpdate("insert into compte(numCompte,soldeCompte ) values ('"+ p.getNumCompte()+"','"+p.getSolde()+"')");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {	
			if(con!=null) {
				connectionDB.disconnect();
			}
		}
	}
	//select id
public compte selectId(int id) {
	Connection con =connectionDB.getconnection();
	compte com = null;
	try {
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from compte where id="+id);
	if (rs.next()){
		int D_id = rs.getInt("id");
		int num1 = rs.getInt("numCompte");
		int sold1 = rs.getInt("soldeCompte");
	com = new compte(D_id, num1, sold1);
	
	}
	
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println();
	
	}
	return  com;
	
}
//selctALl
public static  ArrayList<compte> selectAl(){
	Connection con =connectionDB.getconnection();
	ArrayList<compte> tble= new ArrayList<compte>();
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from compte");
		while (rs.next()) {	
			int id = rs.getInt("id");
			int nom_c = rs.getInt("numCompte");
			int sold_c = rs.getInt("soldeCompte");
			compte DD = new compte(id, nom_c, sold_c);
			tble.add(DD);  
			
		}
      }catch (Exception e) {
  		// TODO: handle exception
  		e.printStackTrace();
  	}finally {	
		if(con!=null) {
			connectionDB.disconnect();
		}
	}
	return tble;
 }
// update
public void update(compte p) {
	Connection con =connectionDB.getconnection();	
try {
	  String query = "UPDATE `compte` SET `numCompte` = '"+ p.getNumCompte() +"' , `soldeCompte` = '"+ p.getSolde() +"' WHERE id = "+p.getId()+"";
      Statement statement = con.createStatement();
      statement.executeUpdate(query);
//Statement st = con.createStatement();
//st.executeUpdate("UPDATE compte SET numCompte='"+p.getNumCompte()+ "', soldeCompte='"+p.getSolde()+"' where id="+p.getId()+"");
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	
//}finally {	
//	if(con!=null) {
//		connectionDB.disconnect();
//	}
}
}
//delete
public void delete(int s_id) {
	Connection con =connectionDB.getconnection();
try {
	
	Statement st = con.createStatement();
st.executeUpdate("delete from compte where id="+s_id+"");
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
