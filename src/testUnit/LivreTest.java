package testUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fusionDP.AdapterLivre;
import livreheros.ISection;
import livreheros.Livre;
import livreheros.Objet;
import livreheros.Section;
import livreheros.SectionAvecObjet;
import ordinateur.Ordinateur;

/**
 * The test class LivreTest.
 *
 * @author  (Rafik & Ahmed)
 * @version (1.0)
 */
public class LivreTest
{
    private ISection section1,section2,init,centrale,fin,vide;
    private Livre livre1;
    SectionAvecObjet obj; 
    private Ordinateur ordi;
    public LivreTest()
    {
    }
   
    @Before
    public void setUp()
    {
        section1 = new Section("introduction");
        section2 = new Section("chapitre1");
        livre1 = new Livre(section1, "mail");
        livre1.ajouterSection(section2);
       
        init = new Section("bienvenue");
        centrale = new Section("milieu");
        init.ajouterEnchainement("choix fin",centrale); 
        fin = new Section("fin");
        fin.ajouterEnchainement("retour debut",init); 
        ordi = new AdapterLivre("Asus",1500,livre1);
        vide = new Section("introduction");
        obj = new SectionAvecObjet(centrale,new Objet("epee",10));
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testAfficherLivre()
    {
        assertEquals("livre numero 1,titre : mail", livre1.afficherLivre());
    }

    @Test
    public void testTexteSectionInitiale()
    {
        assertEquals("introduction", livre1.texteSectionInitiale());
    }
    
    @Test
    public void testTexteSection()
    
    {
    	System.out.println(section1.getTexte());
    	assertEquals("introduction", section1.getTexte());
    }
    
    @Test
    public void testTailleListeSection()
    {
        assertEquals(1, livre1.getTailleListe());
    }
    
    @Test
    public void testAjouterEnchainement()
    {
        assertEquals("milieu", init.getSuivantes().get(0).getTexte());
        assertEquals("choix fin", ((Section) init).getEnchainements().get(0));
    }
    @Test
    public void testTexteEnchainementFinVersDebut()
    {
        //assertEquals("milieu", init.getSuivantes().get(0).getTexte());
    	System.out.println(((Section) fin).getTexteEnchainement());
        assertEquals("Enchainements :retour debut -> Section 39", ((Section) fin).getTexteEnchainement());
    }
    @Test
    public void testTexteEnchainementSectionSansEnchainement()
    {
    	//System.out.println(((Section) vide).getId());
        assertEquals("", ((Section) vide).getTexteEnchainement());
    }
    @Test
    public void testafficherSection()
    {      String a = "Section 21 :bienvenue"+"\n"+
    		"Enchainements :choix fin -> Section 22"+"\n";
    	System.out.println(init.toString());
        assertEquals(a,init.toString());
    }
    
    @Test
    public void testAfficherLivreAdapter()
    {
        assertEquals("livre numero 5,titre : mail", ordi.affiche());
    }
    
    @Test
    public void testDecoratorGetTexte()
    {      String a = "milieu :"+"\n"+
    		"Vous trouvez un nouvel objet : epee"+"\n";
    	System.out.println(obj.getTexte());
        assertEquals(a,obj.getTexte());
    }
    
    
    
    
    
}
