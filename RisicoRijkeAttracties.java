public abstract class RisicoRijkeAttracties extends Attractie{

	RisicoRijkeAttracties(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draaien() {		
	}
	
	public abstract void opstellingsKeuring (int verkochteKaartjes);
		
}