package main;

import java.util.Random;

public class Classica {
static void rand() {
	String[] compositores={"Beethoven", "Bach", "Bartók", "Grieg", "Mozart", "Stravinski", "Wagner", "Strauss II", "Tchaikovsky", "Korsakov"};
	String[] compositoresEscolhidos=new String[3];
	Random rd=new Random();
	for (int i=0; i <= 2; i++) {
		int compositorNaLista=rd.nextInt(((compositores.length)));
		compositoresEscolhidos[(i)]=compositores[(compositorNaLista)]; //wow
		} 
	System.out.println("Aí vão três compositores da minha infindável enciclopédia musical. \n" + compositoresEscolhidos[0] + ", " + compositoresEscolhidos[1] + " e " + compositoresEscolhidos[2] + ".");
}
}