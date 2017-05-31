
public abstract class Livre extends Document{
	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nbPages=" + nbPages + ", numeroEnregistrement=" + numeroEnregistrement
				+ ", titre=" + titre + "]";
	}

	protected String auteur;
	protected int nbPages;
	
	public Livre(int num,String titre,String auteur, int nbPages){
		super(num,titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	public void setAuteur(String auteur){
		this.auteur = auteur;
	}
	
	public void setNbPages(int n){
		nbPages = n;
	}
	
	public String getAuteur(){
		return auteur;
	}
	
	public int getNbPages(){
		return nbPages;
	}
}
