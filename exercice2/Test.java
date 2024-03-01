package exercice2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Annuaire an = new Annuaire();
		Fiche f;
		boolean b = true;
		while (b) {
			System.out.println("Enter your commande (+nom ,?nom ,! or bye : ");

			String cm = scanner.nextLine();

			if (cm.equalsIgnoreCase("bye")) {
				System.out.println("Programme terminé.");
				break;
			} else {
				if (cm.startsWith("+")) {
					System.out.println("Enter your Name :");
					String name = scanner.nextLine();
					System.out.println("Enter your phone number :");
					String num = scanner.nextLine();
					System.out.println("Enter your adress :");
					String add = scanner.nextLine();

					f = new Fiche(name, num, add);
					an.addAnuaire(f);
					System.out.println("Fiche added.");

				} else {
					if (cm.startsWith("?")) {
						System.out.println("Enter your Name :");
						String name = scanner.nextLine();
						f = an.getAnuaire(name);
						if (f != null) {
							System.out.println("Fiche is availble. \n" + f.toString());
						} else {
							System.out.println("there is no such a Fiche !!! ");
						}

					} else if (cm.equals("!")) {
						an.afficherAnuaire();
					} else {
						System.out.println("Commande inconnue.");
					}
				}

			}

		}
		scanner.close();
	}
}