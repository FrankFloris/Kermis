import java.util.ArrayList;
import java.util.Scanner;


public class Kermis {
//	static Scanner scanner = new Scanner(System.in);
	static int ritkeuze;
	static ArrayList<Attractie> attractie = new ArrayList<>();
	public static void main(String[] args) {
		Kermis FranksKermis = new Kermis();
		FranksKermis.kermisbouwen();
		FranksKermis.adverteren();
//		Attractie iets = new Botsauto();
//		nietJuist();
		selecteerRit();
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



private static void selecteerRit() {
	Scanner scanner = new Scanner(System.in);
	if (scanner.hasNextInt()) {
		int select = (scanner.nextInt()-1);
		if (select > 0 && select <6) {
			System.out.println("Je koopt een kaartje voor " + attractie.get(select).naam);
			attractie.get((select)).draaien();
			System.out.println("Deze attractie kost: " + attractie.get(select).ritPrijs + " euro");
			attractie.get(select).verkochteKaartjes++;
			System.out.println("Totaal " + attractie.get(select).verkochteKaartjes + " kaartjes verkocht voor " + attractie.get(select).naam);
			selecteerRit();
		}
		else {
			System.out.println("Dat is helaas geen attractie, kies een nummer van 1-6");
			selecteerRit();
		}
	}
	else if (scanner.hasNext("o")){
		System.out.println("Hoi");
		}
	else if (scanner.hasNext("k")) {
		System.out.println("dat is een k");
	}
	else {
		System.out.println("Dat is geen geldige input, selecteer een nummer van 1-6 ");
//		scanner.close();
		selecteerRit();
		
	}
	}
}
