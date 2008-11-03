package thesis.core;

/**
 * Class Cmagic
 */
public class Cmagic extends Cobject {

  //
  // Fields
  //

  private String spellName;
  private long manaCost;
  private int range;
  
  //
  // Constructors
  //
  public Cmagic () {
        super();
        this.setObjectType( Cmagic.class );
  };
  
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
  public void setSpellName ( String newVar ) {
    this.spellName = newVar;
  }

  /**
   * Get the value of spell_name
   * @return the value of spell_name
   */
  public String getSpellName ( ) {
    return this.spellName;
  }

  /**
   * Set the value of mana_cost
   * @param newVar the new value of mana_cost
   */
  public void setManaCost ( long newVar ) {
    manaCost = newVar;
  }

  /**
   * Get the value of mana_cost
   * @return the value of mana_cost
   */
  public long getManaCost ( ) {
    return manaCost;
  }

  /**
   * Set the value of range
   * @param newVar the new value of range
   */
  public void setRange ( int newVar ) {
    this.range = newVar;
  }

  /**
   * Get the value of range
   * @return the value of range
   */
  public int getRange ( ) {
    return range;
  }

  //
  // Other methods
  //

}
