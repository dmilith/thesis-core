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

  private Vector<UUID> positions;

  //
  // Constructors
  //
  public Ccoordinates ( boolean anything ) {
  }
  
  public Ccoordinates () {
      super();
      positions = new Vector<UUID>(6);
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

  //
  // Other methods
  //

}
