/*
A subclass representing a coffee product.
Includes properties specific to coffee.
*/
public class Coffee extends Beverage {
  /* 
  Instantiating the instance variables needed for the Coffee class.
  These are the hasMilk variable with the data type boolean and the
  hasSugar variable with the data type boolean.
  */
  private boolean hasMilk;
  private boolean hasSugar;
  /*
  This is the no-argument constructor for the Coffee class.
  Intializes a default coffee.
  */
  public Coffee() {
    this.hasMilk = true;
    this.hasSugar = true;
  }
  /*
  This is a paramaterized constructor for the Coffee class.
  The parameters are the hasMilk variable and the hasSugar variable.
  */
  public Coffee(boolean hasMilk, boolean hasSugar) {
    this.hasMilk = hasMilk;
    this.hasSugar = hasSugar;
  }
  /*
  This is the fully parameterized constructor for the Coffee class.
  The same parameters from before are included.
  However, the super keyword is used to add the variables from the Beverage class.
  These variables are the price variable, isIced variable, and isSeasonal variable.
  */
  public Coffee(double price, boolean isIced, boolean isSeasonal, boolean hasMilk, boolean hasSugar) {
    super(price, isIced, isSeasonal);
    this.hasMilk = hasMilk;
    this.hasSugar = hasSugar;
  }
  /*
  Accesor method for the hasMilk variable.
  Returns if the coffee has milk or does not have milk.
  */
  public boolean getHasMilk() {
    return hasMilk;
  }
  /*
  Accesor method for the hasSugar variable.
  Returns if the coffee has sugar or does not have sugar.
  */
  public boolean getHasSugar() {
    return hasSugar;
  }
  /*
  Mutator method for the hasMilk variable.
  The parameter hasMilk is the new status of the coffee (has milk, or does not have milk).
  */
  public void setHasMilk(boolean hasMilk) {
    this.hasMilk = hasMilk;
  }
  /*
  Mutator method for the hasSugar variable.
  The parameter hasSugar is the new status of the coffee (has sugar, or does not have sugar).
  */
  public void setHasSugar(boolean hasSugar) {
    this.hasSugar = hasSugar;
  }
  /*
  Provides a string representation of the Coffee object to print in the console.
  Returns a string containing the state of the beverage object.
  Uses the super keyword to use the toString method contained in the Beverage class.
  Contains the variables in the Beverage toString method (price, isIced, isSeasonal)
  and the variables hasMilk and hasSugar from the Coffee class.
  */
  public String toString() {
    return super.toString() + "\nHas Milk?: " + hasMilk + "\nHas Sugar?: " + hasSugar; 
  }
  
}