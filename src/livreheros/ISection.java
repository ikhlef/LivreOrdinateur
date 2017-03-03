package livreheros;

import java.util.List;

public interface ISection {
	public int getId();
	public List<ISection> getSuivantes();
	public String getTexte();
	public void ajouterEnchainement(String texte, ISection suivante);
	public void afficherSection();
	public String getTexteEnchainement();

}
