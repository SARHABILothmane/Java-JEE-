package entite;

public class compte {
	private int id;
	private int numCompte;
	private int solde ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public compte(int id, int numCompte, int solde) {
		this.id = id;
		this.numCompte = numCompte;
		this.solde = solde;
	}
	public compte(int numCompte, int solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public compte(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "compte [id=" + id + ", numCompte=" + numCompte + ", solde=" + solde + "]";
	}

}
