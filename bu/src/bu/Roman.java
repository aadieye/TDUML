package bu;


public class Roman extends Livre{
	@Override
	public String toString() {
		return "Roman [prixLitteraire=" + prixLitteraire + ", auteur=" + auteur + ", nbPages=" + nbPages
				+ ", numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre + "]";
	}

	private String prixLitteraire;
	
	public Roman(int num, String titre,String auteur, int nbPages, String prix){
		super(num, titre,auteur, nbPages);
		prixLitteraire = prix;
	}
	
	public String getPrixLitteraire(){
		return prixLitteraire;
	}
	
	public void setPrixLitteraire(String prix){
		prixLitteraire = prix;
	}
	public void imprime()
	{
		System.out.println("Imprime"+toString());
	}

	@Override
	public void imprimer() {
		// TODO Auto-generated method stub
		
	}
}
