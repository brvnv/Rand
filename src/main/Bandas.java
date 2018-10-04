package main;

import java.util.Random;

public class Bandas {
static void rand() {
	String[] bandas={"Black Sabbath", "Judas Priest", "Running Wild", "Virgin Steele", "Slayer", "Possessed", "Death", "Darkthrone", "Dissection", "Immortal", "Bathory", "Mayhem", "Sorhin", "Deathspell Omega"};
	Random rn=new Random();
	int bandaNaLista = rn.nextInt(((bandas.length)));
	System.out.println("Se liga nessa: " + bandas[(bandaNaLista)]);
}
}