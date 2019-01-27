class Botsauto extends Attractie {
	int verkochteKaartjes;
	Botsauto(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}
	
	@Override
	public void draaien() {
		System.out.println("Botsen in de botsauto's");
	}
	
}