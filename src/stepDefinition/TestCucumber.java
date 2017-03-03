package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fusionDP.AdapterLivre;
import livreheros.ISection;
import livreheros.Livre;
import livreheros.Objet;
import livreheros.Section;
import livreheros.SectionAvecObjet;
import ordinateur.Ordinateur;

public class TestCucumber {
    private ISection section1,section2,centrale;
    private Livre livre1;
    SectionAvecObjet obj; 
    private Ordinateur ordi;

		@Given("^reccuperation du livre$")
		public void reccuperation_du_livre() throws Throwable {
			
			section1 = new Section("introduction");
	        section2 = new Section("chapitre1");
	        livre1 = new Livre(section1, "mail");
	        livre1.ajouterSection(section2);
	        
		}

		@When("^le livre est bien adapte$")
		public void le_livre_est_bien_adapte() throws Throwable {
			ordi = new AdapterLivre("Asus",1500,livre1);
		}

		@Then("^affichage des differentes sections du livre$")
		public void affichage_des_differentes_sections_du_livre() throws Throwable {
		        ordi.affiche();
		}
      
		@Given("^recuperer un objet et le mettre dans une section$")
		public void recuperer_un_objet_et_le_mettre_dans_une_section() throws Throwable {
			centrale = new Section("milieu");
			 obj = new SectionAvecObjet(centrale,new Objet("epee",10));
		}


		@Then("^affichage de la section decoree$")
		public void affichage_de_la_section_decoree() throws Throwable {
			obj.getTexte();
		}
		
		
		
		
		
		
		
}
