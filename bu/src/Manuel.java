
public class Manuel extends Livre{
	@Override
	public String toString() {
		return "Manuel [niveauScolaire=" + niveauScolaire + ", auteur=" + auteur + ", nbPages=" + nbPages
				+ ", numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre + "]";
	}

	private int niveauScolaire;
	
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
}
