
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
	
}

abstract class RisicoRijkeAttracties extends Attractie{

	RisicoRijkeAttracties(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draaien() {
				
	}
	
	abstract public void opstellingsKeuring();
	
}



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
class Spin extends RisicoRijkeAttracties{
	int verkochteKaartjes;
	Spin(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Draaien, draaien, draaien");
		
	}

	@Override
	public void opstellingsKeuring() {
		// TODO Auto-generated method stub
		
	}
	
}
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
class Hawaii extends RisicoRijkeAttracties{
	int verkochteKaartjes;
	Hawaii(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Rond in de Hawaii!");
		
	}

	@Override
	public void opstellingsKeuring() {
		// TODO Auto-generated method stub
		
	}
}
class Ladderklimmen extends Attractie{
	int verkochteKaartjes;
	Ladderklimmen(double ritPrijs, String naam, int oppervlakte) {
		super(ritPrijs, naam, oppervlakte);
	}

	@Override
	public void draaien() {
		System.out.println("Je gaat lekker ladderklimmen!");
		
	}
}
