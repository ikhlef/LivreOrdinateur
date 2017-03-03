package fusionDP;

import livreheros.Livre;
import ordinateur.Ordinateur;

public class AdapterLivre extends Ordinateur {
Livre livre;
	public AdapterLivre(String nom , double prix, String a, int num) {
		super(nom, prix);
		// TODO Auto-generated constructor stub
		livre= new Livre("");
		 //System.out.println("voila livre"+livre.getNumero());
		this.livre.setNumero(num);
		 //System.out.println("voilaapres modif"+livre.getNumero());
		this.livre.setTitre(a);
		
	}
public AdapterLivre(String nom, double prix,Livre livre) {
	super(nom, prix);
	// TODO Auto-generated constructor stub
	this.livre= livre;
}
	
	 public String affiche(){
	    return livre.afficherLivre();
	   }
	
}
