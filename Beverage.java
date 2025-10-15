/*
A superclass representing a general beverage.
Includes common properties for all beverages.
*/
public class Beverage {
  /* 
  Instantiating the instance variables needed for the Beverage class.
  These are the price variable with data type double, isIced variable with
  data type boolean and isSeasonal variable with data type boolean.
  */
  private double price; 
  private boolean isIced;
  private boolean isSeasonal;
  /*
  This is the no-argument constructor for the Beverage class.
  It intializes a default beverage.
  */
  public Beverage() {
    this.price = 4.99;
    this.isIced = false;
    this.isSeasonal = false;
  }
  /*
  This is a paramaterized constructor for the Beverage class.
  The parameter is the price variable.
  */
  public Beverage(double price) {
    this.price = price;
    this.isIced = false;
    this.isSeasonal = false;
  }
  /*
  This is the fully parameterized constructor for the Beverage class.
  The parameters are the price, isIced, and isSeasonal variables.
  */
  public Beverage(double price, boolean isIced, boolean isSeasonal) {
    this.price = price;
    this.isIced = isIced;
    this.isSeasonal = isSeasonal;
  }
  /*
  Accesor method for the price variable.
  Returns the price of the beverage.
  */
  public double getPrice() {
    return price;
  }
  /*
  Accesor method for the isIced variable.
  Returns if the beverage is iced or is not iced.
  */
  public boolean getIsIced() {
    return isIced;
  }
  /*
  Accesor method for the isSeasonal variable.
  Returns if the beverage is seasonal or not.
  */
  public boolean getIsSeasonal() {
    return isSeasonal;
  }
  /*
  Mutator method for the price variable.
  The parameter price is the new price of the beverage.
  */
  public void setPrice(double price) {
    this.price = price;
  }
  /*
  Mutator method for the isIced variable.
  The parameter isIced is the new status of the beverage (is iced, is not iced).
  */
  public void setIced(boolean isIced) {
    this.isIced = isIced;
  }
  /*
  Mutator method for the isSeasonal variable.
  The parameter isSeasonal is the new status of the beverage (is seasonal, is not seasonal).
  */
  public void setSeasonal(boolean isSeasonal) {
    this.isSeasonal = isSeasonal;
  }
  /*
  Provides a string representation of the Beverage object to print in the console.
  Returns a string containing the state of the Beverage object.
  Includes price, isIced, and isSeasonal variables.
  */
  public String toString() {
    return "Your Beverage! \nPrice: " + price + "\nIced?: " + isIced + "\nSeasonal?: " + isSeasonal; 
  }

}