public class Objective2Lab5{
  public static void main(String[] args){

    double side1, side2, hypotenuse;

    side1 = 10;
    side2 = 8;

    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
    // a^2 + b^2 = c^2

    System.out.println("The hypotenuse of a triange with sides " + side1 + " and " + side2 + " is " + hypotenuse);
    
  }
}
