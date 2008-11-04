package thesis.core;

import java.util.UUID;
import java.util.Vector;

/**
 * Class Ccoordinates
 */
public class Ccoordinates extends Cobject {

  //
  // Fields
  //

  private UUID position;
  private Vector<UUID> positions;

  //
  // Constructors
  //
  public Ccoordinates ( boolean anything ) {
  }
  
  public Ccoordinates () {
      super();
      positions = new Vector<UUID>(6);
      position = UUID.randomUUID();
      for ( int i = 0; i < 5; ++i ) {
          positions.add( i, null );
      }
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  public UUID getPositionOf( int number ) {
      return positions.elementAt( number );
  }

  public void setPositionOf(UUID position, int number) {
      this.positions.insertElementAt(position, number);
  }

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
