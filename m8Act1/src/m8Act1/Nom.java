package m8Act1;

import java.util.Scanner;

public class Nom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String noms[]={"Angel", "Cuesta", "Eva","López","Pol","Castro" };
		 
        for (int i=0; i<noms.length;  i=i+2) {
            System.out.println( noms[i] + " " + noms[i+1]);
        }
		
		entrada.close();

	}

}
