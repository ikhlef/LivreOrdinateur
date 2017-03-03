package livreheros;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Livre here.
 * 
 * @author (Rafik & Ahmed) 
 * @version (a version 1.0 date 20.01.2017)
 */
public class Livre
{
    // instance variables - replace the example below with your own
    private String titre;
    private int numero;
    private static int compteurLivre = 1;
    private ISection init;
    private List<ISection> liste;
    
    public Livre(String titre)
    {
        this.titre= titre;
        this.numero =compteurLivre++;
        this.liste = new ArrayList<ISection>();
    }
    
    public Livre(ISection init, String titre)
    {
       this.titre = titre;
       this.numero = compteurLivre++;
       this.init = init ;
       this.liste = new ArrayList<ISection>();
    }
    
    public void ajouterSection(ISection section){
    	if(! this.liste.contains(section))
    	{
    		liste.add(section);
    	}
    }
    
    public List<ISection> getListeSection()
    {
    	return this.liste;
    }
    
    public int getTailleListe()
    {
    	return this.liste.size();
    }
    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int a){
         this.numero=a;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public void setTitre(String c){
        this.titre=c;
    }
    
    public String afficherLivre(){
        return "livre numero "+ this.numero + ",titre : "+ this.titre ;
    }
    
    public Section getSectionInitiale()
    {
        return (Section) this.init ;
    }
    
    public String texteSectionInitiale()
    {
        return getSectionInitiale().getTexte();
    }
    
    public void afficherSectionLivre(){
    	listeParcourir();
    }

	private void listeParcourir() {
		for(ISection s : liste){
    		 s.afficherSection();
    		//System.out.println(s.getTexteEnchainement()); 
    	}
	}
    
    
    
    
}
