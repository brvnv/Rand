package main;

import java.util.Scanner;
import java.util.Random;

public class Main {
public static void main(String[]args) {
	System.out.println("Pressione 1 para randomizar n�meros, 2 para randomizar bandas ou 3 para compositores de m�sica cl�ssica.");
	Scanner sc=new Scanner(System.in);
	int opicao=sc.nextInt();
if(opicao==1) Numeros.rand();
else if(opicao==2) Bandas.rand();
else if(opicao==3) Classica.rand();
else System.out.println("Voc� n�o deve ter entendido minha pergunta, o que obviamente me deixa muito enfurecido.");
}
}