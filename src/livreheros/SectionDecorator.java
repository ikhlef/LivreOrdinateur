package livreheros;

import java.util.List;

public class SectionDecorator implements ISection 
{ 
	private ISection decorated; 
	
	public SectionDecorator(ISection decorated)
	{	
		this.decorated = decorated; 
	}
	
	public List<ISection> getSuivantes()
	{ 
		return decorated.getSuivantes(); 
	} 
	
	public String getTexte() { 
		return decorated.getTexte();
	}
	
	@Override
	public void ajouterEnchainement(String texte, ISection suivante) { 
		decorated.ajouterEnchainement(texte, suivante);
	}
	
	public String toString() {
		return decorated.toString();
	}

	@Override
	public int getId() {
		return decorated.getId();
	}

	@Override
	public void afficherSection() {
		// TODO Auto-generated method stub
		decorated.afficherSection();;
		
	}

	@Override
	public String getTexteEnchainement() {
		// TODO Auto-generated method stub
		return decorated.getTexteEnchainement();
	}

}

