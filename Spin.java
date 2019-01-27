class Spin extends RisicoRijkeAttracties{
	int verkochteKaartjes;
	int draaiLimiet = 5;
	Spin(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}
	@Override
	public void draaien() {
		System.out.println("Draaien, draaien, draaien");
	}
	public void opstellingsKeuring(int verkochteKaartjes) {
		System.out.println("\n" + "De spin heeft alweer " + verkochteKaartjes + " keer gedraaid" + "\n" + "Het is tijd voor een onderhoudsbeurt");
	}	
}