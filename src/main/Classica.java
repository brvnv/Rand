package main;

import java.util.Random;

public class Classica {
static void rand() {
	String[] compositores={"Beethoven", "Bach", "Bart�k", "Grieg", "Mozart", "Stravinski", "Wagner", "Strauss II", "Tchaikovsky", "Korsakov"};
	String[] compositoresEscolhidos=new String[3];
	Random rd=new Random();
	for (int i=0; i <= 2; i++) {
		int compositorNaLista=rd.nextInt(((compositores.length)));
		compositoresEscolhidos[(i)]=compositores[(compositorNaLista)]; //wow
		} 
	System.out.println("A� v�o tr�s compositores da minha infind�vel enciclop�dia musical. \n" + compositoresEscolhidos[0] + ", " + compositoresEscolhidos[1] + " e " + compositoresEscolhidos[2] + ".");
}
}