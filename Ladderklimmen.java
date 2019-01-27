class Ladderklimmen extends Attractie implements GokAttractie{
	int verkochteKaartjes;
	Ladderklimmen(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Je gaat lekker ladderklimmen!");
	}
	
	public void kansSpelBelastingBetalen(double ritPrijs) {
		Kermis.teBetalenBelasting+=(ritPrijs*0.3);
	}
}