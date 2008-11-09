package thesis.core;

import java.util.Vector;

/**
 * Class Citem
 */
public class Citem extends Cobject implements WorldAttributes {

  //
  // Fields
  //
  private Vector<Ematerial> materials; // materials used to do an item
  private Vector<EitemAttributes> attributes; // attributes of an item
  private EsizeOfItem sizeOfItem;
  private long weight;
  private int amount;
  private String name;
  
  //
  // Constructors
  //
  public Citem ( boolean anything ) {
  }
  
  public Citem () {
        super();
        this.attributes = new Vector<EitemAttributes>();
        this.materials = new Vector<Ematerial>();
        this.setObjectType( Citem.class );
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Get the types of material
   */
  public Ematerial getMaterial( int index ) {
      return materials.get( index );
  }

  /**
   * Set the types of material
   */
  public void setMaterial( Ematerial material, int index ) {
      this.materials.add( index, material );
  }

  /**
   * Get the attribute
   */
  public EitemAttributes getAttribute( int index ) {
      return attributes.get( index );
  }

  /**
   * Set the types of material
   */
  public void setAttribute( EitemAttributes attribute, int index ) {
      this.attributes.add( index, attribute );
  }

  /**
   * Set the value of weight
   * @param newVar the new value of weight
   */
  public void setWeight ( long newVar ) {
    this.weight = newVar;
  }

  /**
   * Get the value of weight
   * @return the value of weight
   */
  public long getWeight ( ) {
    return this.weight;
  }

  /**
   * Set the value of size_of_item
   * @param newVar the new value of size_of_item
   */

  public void setSizeOfItem( EsizeOfItem sizeOfItem) {
      this.sizeOfItem = sizeOfItem;
  }

  /**
   * Get the value of size_of_item
   * @return the value of size_of_item
   */
  public EsizeOfItem getSizeOfItem() {
      return this.sizeOfItem;
  }

  /**
   * Set the value of amount
   * @param newVar the new value of amount
   */
  public void setAmount ( int newVar ) {
    this.amount = newVar;
  }

  /**
   * Get the value of amount
   * @return the value of amount
   */
  public int getAmount ( ) {
    return this.amount;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName ( String newVar ) {
    this.name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName ( ) {
    return this.name;
  }

  //
  // Other methods
  //

}
