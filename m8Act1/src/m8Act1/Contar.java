package m8Act1;

import java.util.Scanner;

public class Contar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int[] numero = new int[100];
		int valor=1;
		
		for (int i=0; i<numero.length; i++) {
			numero[i]= valor;
			valor++;
		}
		for (int i=0; i<numero.length; i++) {
			System.out.print(numero[i]+" ");
		}
		System.out.println();
		
		entrada.close();
	}

}
