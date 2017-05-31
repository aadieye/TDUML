package bu;

import java.util.Comparator;
//dans cette classe on a une methode qui permet de comparer les livres
public class Comparateur implements Comparator<Document>{

	@Override
	public int compare(Document doc1, Document doc2) {
		return doc1.getTitre().compareTo(doc2.getTitre()) ;
	}
}