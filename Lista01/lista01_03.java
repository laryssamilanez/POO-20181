package lista01;

import java.util.Scanner;

class lista01_03{
  public static void main(String[] args){
  	
  	Scanner input = new Scanner(System.in);
  	int p1 = 2; 
    int p2 = 3;
    int p3 = 5;
  	float n1, n2, n3;
  	float medias;
  	
  	n1 = input.nextFloat();
    n2 = input.nextFloat();
    n3 = input.nextFloat();
  	medias = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
    System.out.println(medias);
  }
}