package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entite.users;

public class autentificationBq {
public users checkin(users user) {
	
		Connection con =connectionDB.getconnection();
		try {
			System.out.println("Objet statement ok");
			String query = "SELECT * FROM login WHERE (name=? OR email=?) and password=?";
			PreparedStatement st= con.prepareStatement(query);
			st.setString(1, user.getName());
			st.setString(2,user.getEmail());
			st.setString(3, user.getPassword());
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				int id =rs.getInt("id");
				String name = rs.getString("name");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String password = rs.getString("password");
				user.setPrenom(prenom);
				user.setEmail(email);
				user.setValide(true);
			}else {
				user.setValide(false);
			}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {	
			if(con!=null) {
				connectionDB.disconnect();
			}
		}
return user;
 }
}
