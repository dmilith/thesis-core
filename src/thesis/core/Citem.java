package thesis.core;

/**
 * Class Citem
 */
public class Citem extends Cobject {

  //
  // Fields
  //

  private long weight;
  private int sizeOfItem;

  private int amount;
  private String name;
  
  //
  // Constructors
  //
  public Citem () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of weight
   * @param newVar the new value of weight
   */
  private void setWeight ( long newVar ) {
    this.weight = newVar;
  }

  /**
   * Get the value of weight
   * @return the value of weight
   */
  private long getWeight ( ) {
    return this.weight;
  }

  /**
   * Set the value of size_of_item
   * @param newVar the new value of size_of_item
   */

  public void setSizeOfItem(int sizeOfItem) {
      this.sizeOfItem = sizeOfItem;
  }

  /**
   * Get the value of size_of_item
   * @return the value of size_of_item
   */
  public int getSizeOfItem() {
      return this.sizeOfItem;
  }

  /**
   * Set the value of amount
   * @param newVar the new value of amount
   */
  private void setAmount ( int newVar ) {
    this.amount = newVar;
  }

  /**
   * Get the value of amount
   * @return the value of amount
   */
  private int getAmount ( ) {
    return this.amount;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName ( String newVar ) {
    this.name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName ( ) {
    return this.name;
  }

  //
  // Other methods
  //

}
