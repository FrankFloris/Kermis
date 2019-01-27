class Hawaii extends RisicoRijkeAttracties{
	int verkochteKaartjes;
	int draaiLimiet = 10;
	Hawaii(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Rond in de Hawaii!");
	}

	public void opstellingsKeuring(int verkochteKaartjes) {
		System.out.println("\n" + "De hawaii heeft alweer " + verkochteKaartjes + " keer gedraaid" + "\n" + "Het is tijd voor een onderhoudsbeurt");
	}	
}