import java.util.Scanner;

public class Objective7Lab3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while(selection != 3){

      printMenu();
      selection = scanner.nextInt();

      if(selection == 1){
        System.out.println("Hello world!");
      }
      else if(selection == 2){
        System.out.println("Pizza, Beer, Hamburgers");
      }
      else if(selection == 3){
        System.out.println("Goodbye!");
      }
      else{
        System.out.println("Invalid option, please try again!");
      }
    }
  }
  public static void printMenu() {
  System.out.println("_____Menu_____");
  System.out.println("1: Say Hello");
  System.out.println("2: List My favorite foods");
  System.out.println("3: Exit");
  System.out.println();
}

}
