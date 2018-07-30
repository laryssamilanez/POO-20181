package lista01;

import java.util.Scanner;

class lista01_04{
  public static void main(String[] args){
  	
  	Scanner input = new Scanner(System.in);
  	float n1, n2, n3, n4;
  	float media;
  	float pmedia = 7.0f;
  	float cmedia = 5.0f;
  	
  	n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();
    n4 = input.nextInt();
  	media = (n1 + n2 + n3 + n4)/4;
  	if (media >= pmedia) {
  		System.out.println("A media do aluno é: " + media + "\nO aluno foi aprovado!");
  	}
  	else if(media >= cmedia && media < pmedia) {
  		System.out.println("A media do aluno é: " + media + "\nO aluno vai para final!");
  	}
  	else {
  		System.out.println("A media do aluno é: " + media + "\nO aluno foi reprovado!");
  	}
  }
}
