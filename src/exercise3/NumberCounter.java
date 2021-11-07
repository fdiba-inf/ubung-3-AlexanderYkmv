package exercise3;

import java.util.Scanner;

public class NumberCounter {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter numbers: ");

    int number = input.nextInt();
    int positive = 0;
    int negative = 0;
    double sum = 0;
    double avr = 0;
    while (number !=0) {
      if (number > 0) {
        positive ++;
      } else {
        negative ++;
      }
      sum = sum + number;
      avr = sum / (positive + negative);
      number = input.nextInt();

      System.out.println("Positive numbers: " + positive);
      System.out.println("Negative numbers: " + negative);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + avr);


    }

  }
}
