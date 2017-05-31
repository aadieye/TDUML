package bu;

public class Manuel extends Livre{
	private int niveauScolaire;
	// la methode toString return les informations sur le manuel
	@Override
	public String toString() {
		return "Manuel [niveauScolaire=" + niveauScolaire + ", auteur=" + auteur + ", nbPages=" + nbPages
				+ ", numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre + "]";
	}

	//constructeur du manuel
	public Manuel(int num, String titre,String auteur, int nbPages, int niveau){
		super(num, titre, auteur, nbPages);
		niveauScolaire = niveau;
		
	}
	public void setNiveauScolaire(int n){
		niveauScolaire = n;
	}
	
	public int getNiveauScolaire(){
		return niveauScolaire;
	}
	//methode imprime qui derive de l'interface Imprimable
	public void imprime()
	{
		System.out.println("Imprime"+toString());
	}
	@Override
	public void imprimer() {
		// TODO Auto-generated method stub
		
	}
}
