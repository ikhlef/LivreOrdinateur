package livreheros;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Section here.
 * 
 * @author (Rafik & Ahmed) 
 * @version (1.0 date 20.01.2017)
 */
public class Section implements ISection
{
    // instance variables - replace the example below with your own
    private static int compteur = 1; 
    private int id;
    private String texte;
    
    private boolean atteinte = false;
    private List<ISection> suivantes;
    private List<String> enchainements; 
    
    public Section(String texte)
    {
        this.id = compteur++ ;
        this.texte = texte ;
        suivantes = new ArrayList<ISection>();
        enchainements = new ArrayList<String>();   
    }
    
    public boolean isAtteinte() 
    { 
    	return atteinte;
    }
    public void setAtteinte(boolean atteinte)
    {
    	this.atteinte = atteinte;
    }
    @Override
    public int getId(){
        return id;
    }
    @Override
    public String getTexte(){
        return this.texte;
    }
    
    public void setTexte(String texte){
        this.texte=texte;
    }
    @Override
    public List<ISection> getSuivantes()
    {
    	return suivantes;
    }
    
    public List<String> getEnchainements()
    {
    	return enchainements;
    }
   
    
    public String getTexteEnchainement()
    {
    	if (enchainements.size()==0) 
    		return "";
    	String retour = "Enchainements :";
    	for (int i=0;i<enchainements.size();i++){
    		retour += enchainements.get(i);
    		retour += " -> Section " + suivantes.get(i).getId();// + "\n";
    	}
    	return retour;
    }
    
    public String toString()
    { 
    	String retour = "Section "+ getId() + " :" + getTexte() + "\n" + getTexteEnchainement();
    	return retour + "\n"; 
    } 
       
    public void afficherSection(){
        System.out.println(toString());
    }

	@Override
	public void ajouterEnchainement(String texte, ISection suivante) {
		// TODO Auto-generated method stub
		suivantes.add(suivante);
    	enchainements.add(texte);
	}

	
}
