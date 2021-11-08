package exercise3;

import java.lang.Math;

import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input: ");
    double number;
    double grad;
    double radian;
    char type;
    do {
      number = input.nextDouble();
      type = input.next().charAt(0);
     
      if(number == 'd') {
        grad = (number * 180) / Math.PI;
        System.out.println("Angle" + grad);
        
        

      } else if (type == 'r') {
        radian = (number * Math.PI) / 180;
        System.out.println("Angle" + radian);
      }
      
      
    } while(type == 'r' || type == 'd');




  }
}