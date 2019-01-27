class Spiegelpaleis extends Attractie{
	int verkochteKaartjes;
	Spiegelpaleis(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Veel plezier in het spookhuis!");
		
	}
}