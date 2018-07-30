package lista01;

import java.util.Scanner;

class lista01_02{
  public static void main(String[] args){
  	
  	Scanner input = new Scanner(System.in);
  	int atual = 2018; 
  	int nasc;
  	int idades;
  	
  	nasc = input.nextInt();
  	idades = (atual - nasc);
    System.out.println(idades);
  }
}
