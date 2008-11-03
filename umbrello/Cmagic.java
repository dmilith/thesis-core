

/**
 * Class Cmagic
 */
public class Cmagic {

  //
  // Fields
  //

  private String spell_name;
  private long mana_cost;
  private uint32_t range;
  
  //
  // Constructors
  //
  public Cmagic () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of spell_name
   * @param newVar the new value of spell_name
   */
  private void setSpell_name ( String newVar ) {
    spell_name = newVar;
  }

  /**
   * Get the value of spell_name
   * @return the value of spell_name
   */
  private String getSpell_name ( ) {
    return spell_name;
  }

  /**
   * Set the value of mana_cost
   * @param newVar the new value of mana_cost
   */
  private void setMana_cost ( long newVar ) {
    mana_cost = newVar;
  }

  /**
   * Get the value of mana_cost
   * @return the value of mana_cost
   */
  private long getMana_cost ( ) {
    return mana_cost;
  }

  /**
   * Set the value of range
   * @param newVar the new value of range
   */
  private void setRange ( uint32_t newVar ) {
    range = newVar;
  }

  /**
   * Get the value of range
   * @return the value of range
   */
  private uint32_t getRange ( ) {
    return range;
  }

  //
  // Other methods
  //

}
