package entite;

public class client {
	private int id;
	private String nom ;
	private String prenom;
	private int cin;
	private compte compte_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public compte getCompte_id() {
		return compte_id;
	}
	public void setCompte_id(compte compte_id) {
		this.compte_id = compte_id;
	}
	public client(int id, String nom, String prenom, int cin, compte compte_id) {
	
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.compte_id = compte_id;
	}
	public client(String nom, String prenom, int cin, compte compteId) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.compte_id = compteId;
	}
	@Override
	public String toString() {
		return "client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", compte_id=" + compte_id
				+ "]";
	}

	

}
