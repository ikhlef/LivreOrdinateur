package livreheros;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section init = new Section("bienvenue");
		Section fin = new Section("fin");
		Section centrale = new Section("milieu");
		SectionAvecObjet obj = new SectionAvecObjet(centrale,new Objet("epee",10));
		SectionAvecObjet obj2 = new SectionAvecObjet(obj,new Objet("bouclier",20));
		
		init.ajouterEnchainement("choix fin",centrale);
		fin.ajouterEnchainement("retour debut",init); 
		
		Livre l = new Livre(init,"Mail");
		l.ajouterSection(init);
		l.ajouterSection(fin);
		l.ajouterSection(obj2);
		System.out.println(l.afficherLivre()); 
		l.afficherSectionLivre();
		System.out.println("voila l objet :"+obj.getTexte());

	}

}
