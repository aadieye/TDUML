package bu;


public abstract class Livre extends Document implements Imprimable{
	
	protected String auteur;
	protected int nbPages;
	
	//cette methode retourne les informations sur le livre
	@Override
	public String toString() 
	{
		return "Livre [auteur=" + auteur + ", nbPages=" + nbPages + ", numeroEnregistrement=" + numeroEnregistrement
				+ ", titre=" + titre + "]";
	}

	//constructeur de livre
	public Livre(int num,String titre,String auteur, int nbPages){
		super(num,titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	//permet d'initialiser les informations sur l'auteur
	public void setAuteur(String auteur){
		this.auteur = auteur;
	}
	//permet d'initialiser le nombre de page
	public void setNbPages(int n){
		nbPages = n;
	}
	//permet d'obtenir l'auteur d'un livre
	public String getAuteur(){
		return auteur;
	}
	//permet d'obtenir le nombre de page du livre
	public int getNbPages(){
		return nbPages;
	}
}
