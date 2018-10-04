package main;

import java.util.Random;

public class Numeros {
static void rand() {
	Random r=new Random();
	int numero=r.nextInt((101));
	System.out.println("Pensei em um número. Que tal " + numero + "?");
	System.out.println("Pensei em outro. " + r.nextInt((101)));
	int numero_final=r.nextInt((101));
	System.out.println("O último. " + numero_final + ".");
}
}