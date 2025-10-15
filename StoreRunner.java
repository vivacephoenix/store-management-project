/*
StoreRunner class serves as the Tester Class.
Demonstrates the functionality of the Beverage, Coffee, and Tea classes.
*/
public class StoreRunner {
  public static void main(String[] args) {

    /*
    No-argument constructor for the super class Beverage.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Beverage b = new Beverage();
    System.out.println(b);
    System.out.println();

    /*
    Parameterized constructor for the super class Beverage (price only).
    The state of the instantiated object is printed out and a new line is printed.
    */
    Beverage b1 = new Beverage(8.99);
    System.out.println(b1);
    System.out.println();

    /*
    Fully parameterized constructor for the super class Beverage.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Beverage b2 = new Beverage(6.99, true, false);
    System.out.println(b2);
    System.out.println();

    /*
    No-argument constructor for the subclass Coffee.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Coffee c = new Coffee();
    System.out.println(c);
    System.out.println();

    /*
    Parameterized constructor for the subclass Coffee (hasMilk and hasSugar).
    The state of the instantiated object is printed out and a new line is printed.
    */
    Coffee c1 = new Coffee(false, true);
    System.out.println(c1);
    System.out.println();

    /*
    Fully parameterized constructor for the subclass Coffee.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Coffee c2 = new Coffee(8.99, false, true, true, false);
    System.out.println(c2);
    System.out.println();

    /*
    No-argument constructor for the subclass Tea.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Tea t = new Tea();
    System.out.println(t);
    System.out.println();

    /*
    Parameterized constructor for the subclass Tea (isHerbal only).
    The state of the instantiated object is printed out and a new line is printed.
    */
    Tea t1 = new Tea(true);
    System.out.println(t1);
    System.out.println();

    /*
    Fully parameterized constructor for the subclass Tea.
    The state of the instantiated object is printed out and a new line is printed.
    */
    Tea t2 = new Tea(4.99, false, false, true);
    System.out.println(t2);
    System.out.println();
  }
}