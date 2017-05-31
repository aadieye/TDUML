package bu;

import java.util.ArrayList;
import java.util.Collections;
//classe permettant de gerer des documents
public class Etagere {
	private ArrayList<Document> listeDocuments;
	private int nbDocMax;
	/**
	 * 
	 * @param nbDocMax represente le nombre maximale de documents 
	 */
	public Etagere(int nbDocMax){
		listeDocuments = new ArrayList<Document>();
		this.nbDocMax = nbDocMax;
	}
	/**
	 * 
	 * @return un 
	 */
	public ArrayList<Document> getListeDocuments(){
		return listeDocuments;
	}
	
	public void setListeDocuments(ArrayList<Document> l){
		listeDocuments = l;
	}

	public int getNbDocMax(){
		return nbDocMax;
	}
	
	public void setNbDocMax(int n){
		nbDocMax = n;
	}
	//methode pour ajouter un document
	public void ajoutDocument(Document doc){
		if (listeDocuments.size() < nbDocMax){
			listeDocuments.add(doc);
			System.out.println("Vous avez bien ajouté le livre");
			doc.setEtagere(this);
		}
		else
			System.out.println("Vous n'avez plus de place dans cette étagère");
	}
	//affichage d'un document

	public void afficheDocuments(){
		System.out.println("Documents dans l'étagère: ");
		for (Document doc : listeDocuments)
			System.out.println(doc.toString());
	}
	//methode permettant  la recherche d'un document par nom de l'auteur
	public void rechercherDocument(String auteur){
		boolean trouve = false;
		ArrayList<Livre> livres = new ArrayList<Livre>();
		for (Document doc : listeDocuments){
			if (doc instanceof Livre){
				livres.add((Livre) doc);
				}
		}
		for (Livre l : livres){
			if (l.getAuteur() == auteur){
				System.out.println(l.toString());
				trouve = true;
				break;
			}
		if (!trouve)
			System.out.println("Il n' y a pas de document de l'auteur " + auteur);
			
	}


		
	}
	
// le trie de l'etagere se fait a partir de la methode sort de la classe collections et 
//et qui prend en parametre une instance de la classe comparateur 
	public void trieEtagere()
	{
		Collections.sort(listeDocuments, new Comparateur());
	}
	
	}

