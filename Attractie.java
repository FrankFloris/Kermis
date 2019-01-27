
abstract public class Attractie {
	double ritPrijs;
	String naam;
	int oppervlakte;
	int verkochteKaartjes;
	Attractie(double ritPrijs, String naam, int oppervlakte){
		this.ritPrijs = ritPrijs;
		this.naam = naam;
		this.oppervlakte = oppervlakte;	
	}
	abstract public void draaien();
	public void opstellingsKeuring() {
		// TODO Auto-generated method stub
		
	}
	
}
