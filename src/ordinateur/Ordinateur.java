package ordinateur;

public class Ordinateur {
	
	private String nom;
	private double prix;
	private DisqueDur d;

	public Ordinateur(String nom , double prix)
	{
		this.nom=nom;
		if(prix>=0)
			this.prix=prix;
		else
			this.prix=0;
	}


	public String getNom(){
		return nom;
	}

	public double getPrix(){
		return prix;
	}

	public void setPrix(double prix ){
		if(prix>=0)
			this.prix=prix;
		else
			this.prix=0;

	}

	public void setDisqueDur(DisqueDur d){
		this.d=d;
	}

	public DisqueDur getDisqueDur(){
		return d;
	}

	public String toString(){
		if(d == null)
			return "Bonjour je suis l'ordinateur : "+nom+" et je coûte : "+prix+"€";
		else
			return "Bonjour je suis l'ordinateur : "+nom+" et je coûte : "+prix+"€ ."+d.toString();
	}
	
   public String affiche(){
    
	   return toString();
   }

}
