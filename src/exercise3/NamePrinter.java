package exercise3;

import java.util.Scanner;

public class NamePrinter {
  public static void main(String[] args){
  System.out.print("Enter text: ");
  Scanner input = new Scanner(System.in);
  String text = input.nextLine();
  for(int index = 0; index < text.length(); index++){
    System.out.println("* " + text.charAt(index) + " *" );
  }

  }
}