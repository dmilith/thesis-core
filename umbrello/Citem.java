

/**
 * Class Citem
 */
public class Citem {

  //
  // Fields
  //

  private uint64_t weight;
  private Esize size_of_item;
  private uint32_t amount;
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
  private void setWeight ( uint64_t newVar ) {
    weight = newVar;
  }

  /**
   * Get the value of weight
   * @return the value of weight
   */
  private uint64_t getWeight ( ) {
    return weight;
  }

  /**
   * Set the value of size_of_item
   * @param newVar the new value of size_of_item
   */
  private void setSize_of_item ( Esize newVar ) {
    size_of_item = newVar;
  }

  /**
   * Get the value of size_of_item
   * @return the value of size_of_item
   */
  private Esize getSize_of_item ( ) {
    return size_of_item;
  }

  /**
   * Set the value of amount
   * @param newVar the new value of amount
   */
  private void setAmount ( uint32_t newVar ) {
    amount = newVar;
  }

  /**
   * Get the value of amount
   * @return the value of amount
   */
  private uint32_t getAmount ( ) {
    return amount;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName ( String newVar ) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName ( ) {
    return name;
  }

  //
  // Other methods
  //

}
