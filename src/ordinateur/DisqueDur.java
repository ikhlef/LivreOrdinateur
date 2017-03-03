package ordinateur;

public class DisqueDur {
	
	private int capacite;

	public DisqueDur(int x)
	{
		if(x>=0)
			this.capacite = x;
		else
			this.capacite=0;
	}

	public int getCapacite(){
		return this.capacite;
	}

	public void setCapacite(int x){
		if(x>=0)
			this.capacite = x;
		else
			this.capacite=0;
	}

	public String toString(){
		return "La capacité de mon disque dur est de : "+capacite+" GB";   
	}

}
