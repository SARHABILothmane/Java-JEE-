package entite;
public class users {
	private int id ;
	private String prenom;
	private String  name;
	private String email;
	private String password;
	private Boolean valide;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getValide() {
		return valide;
	}
	public void setValide(Boolean valide) {
		this.valide = valide;
	}
	public users(int id, String prenom, String name, String email, String password, Boolean valide) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.name = name;
		this.email = email;
		this.password = password;
		this.valide = valide;
	}
	
	public users(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", prenom=" + prenom + ", name=" + name + ", email=" + email 
				+ ", password=" + password + ", valide=" + valide + "]";
	}


}

