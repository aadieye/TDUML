package bu;


public class Dictionnaire extends Document{
	private String langue;
	
	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre
				+ "]";
	}

	public Dictionnaire(int num,String titre,String langue){
		super(num,titre);
		this.langue = langue;
	}
	
	public String getLangue(){
		return langue;
	}
	
	public void setLangue(String langue){
		this.langue = langue;
	}
}