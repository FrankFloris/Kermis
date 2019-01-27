import java.util.ArrayList;
import java.util.Scanner;


public class Kermis {
//	static Scanner scanner = new Scanner(System.in);
	static int ritkeuze;
	static ArrayList<Attractie> attractie = new ArrayList<>();
	static int verkochteKaartjes;
	static double totaleOmzet;
	static double teBetalenBelasting = 0;
	public static void main(String[] args) {
		Kermis FranksKermis = new Kermis();
		FranksKermis.kermisbouwen();
		FranksKermis.adverteren();
		FranksKermis.selecteerRit();
//		Scanner scanner = new Scanner(System.in);S

		
	}

private void kermisbouwen() {
		Attractie bots = new Botsauto(2.50, "botsauto", 200);
		attractie.add(bots);
		Attractie spin = new Spin(2.25, "spin", 125);
		attractie.add(spin);
		Attractie spiegel = new Spiegelpaleis(2.75, "spiegelpaleis", 175);
		attractie.add(spiegel);
		Attractie spook = new Spookhuis(3.20, "spookhuis", 180);
		attractie.add(spook);
		Attractie hawaii = new Hawaii(2.90, "hawaii", 1000);
		attractie.add(hawaii);
		Attractie ladder = new Ladderklimmen(5.00, "ladderklimmen", 25);
		attractie.add(ladder);
	}

private void adverteren() {
	System.out.println("Welkom bij Frank's fantastische kermis!" + "\n" + "Waar wil je in gaan?");
	int i = 1;
	for (Attractie attractie : attractie ) {
		System.out.println("Kies " + i + " voor " + attractie.naam);
		i++;
	}
}



public void selecteerRit() {
	Scanner scanner = new Scanner(System.in);
	if (scanner.hasNextInt()) {
		int select = (scanner.nextInt()-1);
		if (select >= 0 && select <6) {
			System.out.println("Je koopt een kaartje voor " + attractie.get(select).naam);
			attractie.get((select)).draaien();
			System.out.println("Deze attractie kost: " + attractie.get(select).ritPrijs + " euro");
			attractie.get(select).verkochteKaartjes++;
			verkochteKaartjes++;
			totaleOmzet += attractie.get(select).ritPrijs;
			if (attractie.get(select) instanceof RisicoRijkeAttracties) {
//				((RisicoRijkeAttracties) attractie.get(select)).opstellingsKeuring(attractie.get(select));
				if (attractie.get(select) instanceof Hawaii) {
					if (attractie.get(select).verkochteKaartjes % 10 ==0){
						((RisicoRijkeAttracties) attractie.get(select)).opstellingsKeuring((attractie.get(select).verkochteKaartjes));
					}
				}
				else if (attractie.get(select) instanceof Spin) {
					if (attractie.get(select).verkochteKaartjes % 5 ==0){
						(( RisicoRijkeAttracties)attractie.get(select)).opstellingsKeuring((attractie.get(select).verkochteKaartjes));
					}
				}
			}
		if (attractie.get(select) instanceof GokAttractie) {
				((GokAttractie) attractie.get(select)).kansSpelBelastingBetalen((attractie.get(select).ritPrijs));
			}
			selecteerRit();
		}
		else {
			System.out.println("Dat is helaas geen attractie, kies een nummer van 1-6");
			selecteerRit();
		}
	}
	else if (scanner.hasNext("o")){
		for (Attractie attractie: attractie) {
			System.out.println("Totale omzet voor " + attractie.naam + " is: " + (String.format("%.2f", attractie.verkochteKaartjes*attractie.ritPrijs)));
		}
		System.out.println("De totale omzet van de Kermis is: " + (String.format("%.2f", totaleOmzet)));
		System.out.println("Te betalen belasting over gokattracties is: " + (String.format("%.2f",teBetalenBelasting )));
		System.out.println("De winst is: " + (String.format("%.2f",(totaleOmzet-teBetalenBelasting))));
		selecteerRit();
		}
	else if (scanner.hasNext("k")) {
		for (Attractie attractie: attractie) {
			System.out.println("Totaal " + attractie.verkochteKaartjes + " kaartjes verkocht voor " + attractie.naam);
		}
		System.out.println("Totaal aantal verkochte kaartjes: " + verkochteKaartjes);
		selecteerRit();
	}
	else {
		System.out.println("Dat is geen geldige input, selecteer een nummer van 1-6 ");
//		scanner.close();
		selecteerRit();
		
	}
	}

}
