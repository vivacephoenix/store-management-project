/*
A subclass representing a tea product.
Includes properties specific to tea.
*/
public class Tea extends Beverage {
  /*
  Instatiating the instance variables needed for the Tea class.
  This is the isHerbal variable with the data type boolean.
  */
  private boolean isHerbal;
  /*
  This is the no-argument constructor for the tea class.
  Instantiates a default tea object.
  */
  public Tea() {
    this.isHerbal = false;
  }
  /*
  A parameterized constructor for the Tea class.
  The parameter is the isHerbal variable.
  */
  public Tea(boolean isHerbal) {
    this.isHerbal = isHerbal;
  }
  /*
  Fully parameterized constructor for the Tea class.
  The same parameter of isHerbal is used.
  The super keyword is used to include the instance variables from the Beverage super class.
  These variables are price, isIced, and isSeasonal.
  */
  public Tea(double price, boolean isIced, boolean isSeasonal, boolean isHerbal) {
    super(price, isIced, isSeasonal);
    this.isHerbal = isHerbal;
  }
  /*
  Accesor method for the isHerbal variable.
  Returns if the tea is herbal or not herbal.
  */
  public boolean getIsHerbal() {
    return isHerbal;
  }
  /*
  Mutator method for the isHerbal variable.
  The parameter isHerbal is the new status for the tea (is herba, or is not herbal).
  */
  public void setHerbal(boolean isHerbal) {
    this.isHerbal = isHerbal;
  }
  /*
  Provides a string representation of the Tea object to print in the console.
  Returns a string containing the state of the tea object.
  Uses the super keyword to use the toString method contained in the Beverage class.
  Contains the variables in the Beverage toString method (price, isIced, isSeasonal)
  and the variable isHerbal from the Tea class.
  */
  public String toString() {
    return super.toString() + "\nHerbal?: " + isHerbal; 
  }

}