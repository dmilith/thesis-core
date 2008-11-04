package thesis.core;

import java.util.UUID;

/**
 * Class Ccoordinates
 */
public class Ccoordinates extends Cobject {

  //
  // Fields
  //

  private UUID position;
  
  //
  // Constructors
  //
  public Ccoordinates ( boolean anything ) {
  }
  
  public Ccoordinates () {
      super();
      position = UUID.randomUUID();
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  private void setPosition ( UUID newVar ) {
    this.position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  private UUID getPosition ( ) {
    return this.position;
  }

  //
  // Other methods
  //

}
