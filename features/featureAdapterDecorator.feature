Feature: Affichage du livre dont vous etes le heros depuis un ordnateur (Adapter & Decorator)

	Scenario: utilisation du Pattern Adapter
		Given reccuperation du livre 	
		When le livre est bien adapte 
		Then affichage des differentes sections du livre

	Scenario: utilisation du Pattern Decorator
		Given recuperer un objet et le mettre dans une section 	
		Then  affichage de la section decoree
		