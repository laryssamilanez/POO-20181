package lista01;

import java.util.Scanner;

class lista01_01{
  public static void main(String[] args){
  	
  	Scanner input = new Scanner(System.in);
  	float conv = 3.6f; 
  	float n;
  	float conversaos;
  	
  	n = input.nextInt();
  	conversaos = (n * conv);
    System.out.println(conversaos);
  }
}