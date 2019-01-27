class Spookhuis extends Attractie{
	int verkochteKaartjes;
	Spookhuis(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Oeeeeeh, het spookhuis!");
		
	}
}