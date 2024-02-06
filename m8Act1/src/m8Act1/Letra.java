package m8Act1;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		final int MAX_CHAR=127;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introdueix la frase: ");
		String frase = entrada.nextLine();
		
		int[] comptadors = new int[MAX_CHAR];
		
		// comptar les ocurrències de cada caràcter
		for (int i=0; i<frase.length(); i++) {
			char c = frase.charAt(i);
			int numChar=(int)c;
			comptadors[numChar]++;
		}
		
		// representació del resultat
		
		System.out.println("\nAparicions de cada caràcter:\n");
		
		for (int i=0; i<comptadors.length; i++) {
			if (comptadors[i]>0) //si el caràcter ha aparegut
				System.out.printf("%c : %d%n", (char)i, comptadors[i]);
		}	
		
		entrada.close();

	}

}