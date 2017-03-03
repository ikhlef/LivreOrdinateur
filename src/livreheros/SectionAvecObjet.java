package livreheros;

public class SectionAvecObjet extends SectionDecorator {

	private Objet objet;
	public SectionAvecObjet(ISection decorated, Objet obj)
	{
		super(decorated);
		this.objet = obj;
	}

	public String getTexte() {
		String retour = super.getTexte()+" :\n";//le super est critique 
		retour += "Vous trouvez un nouvel objet : " + objet.getDescription() + "\n";
	return retour;
	}

}
