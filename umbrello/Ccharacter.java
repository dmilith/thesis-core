

/**
 * Class Ccharacter
 */
public class Ccharacter {

  //
  // Fields
  //

  private uint32_t health;
  private Eraces race;
  private uint32_t inteligence;
  private uint32_t strength;
  private uint32_t dexterity;
  private uint32_t mind_strength;
  private int64_t gold;
  private uint16_t age;
  private int16_t luck;
  private Citem items;
  private Citem private_box;
  private boolean dead;
  private Ccoordinates position;
  private Csoul soul;
  private String name;
  private uint32_t combat_ability;
  private uint32_t armor;
  
  //
  // Constructors
  //
  public Ccharacter () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of health
   * @param newVar the new value of health
   */
  private void setHealth ( uint32_t newVar ) {
    health = newVar;
  }

  /**
   * Get the value of health
   * @return the value of health
   */
  private uint32_t getHealth ( ) {
    return health;
  }

  /**
   * Set the value of race
   * @param newVar the new value of race
   */
  private void setRace ( Eraces newVar ) {
    race = newVar;
  }

  /**
   * Get the value of race
   * @return the value of race
   */
  private Eraces getRace ( ) {
    return race;
  }

  /**
   * Set the value of inteligence
   * @param newVar the new value of inteligence
   */
  private void setInteligence ( uint32_t newVar ) {
    inteligence = newVar;
  }

  /**
   * Get the value of inteligence
   * @return the value of inteligence
   */
  private uint32_t getInteligence ( ) {
    return inteligence;
  }

  /**
   * Set the value of strength
   * @param newVar the new value of strength
   */
  private void setStrength ( uint32_t newVar ) {
    strength = newVar;
  }

  /**
   * Get the value of strength
   * @return the value of strength
   */
  private uint32_t getStrength ( ) {
    return strength;
  }

  /**
   * Set the value of dexterity
   * @param newVar the new value of dexterity
   */
  private void setDexterity ( uint32_t newVar ) {
    dexterity = newVar;
  }

  /**
   * Get the value of dexterity
   * @return the value of dexterity
   */
  private uint32_t getDexterity ( ) {
    return dexterity;
  }

  /**
   * Set the value of mind_strength
   * @param newVar the new value of mind_strength
   */
  private void setMind_strength ( uint32_t newVar ) {
    mind_strength = newVar;
  }

  /**
   * Get the value of mind_strength
   * @return the value of mind_strength
   */
  private uint32_t getMind_strength ( ) {
    return mind_strength;
  }

  /**
   * Set the value of gold
   * @param newVar the new value of gold
   */
  private void setGold ( int64_t newVar ) {
    gold = newVar;
  }

  /**
   * Get the value of gold
   * @return the value of gold
   */
  private int64_t getGold ( ) {
    return gold;
  }

  /**
   * Set the value of age
   * @param newVar the new value of age
   */
  private void setAge ( uint16_t newVar ) {
    age = newVar;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  private uint16_t getAge ( ) {
    return age;
  }

  /**
   * Set the value of luck
   * @param newVar the new value of luck
   */
  private void setLuck ( int16_t newVar ) {
    luck = newVar;
  }

  /**
   * Get the value of luck
   * @return the value of luck
   */
  private int16_t getLuck ( ) {
    return luck;
  }

  /**
   * Set the value of items
   * @param newVar the new value of items
   */
  private void setItems ( Citem newVar ) {
    items = newVar;
  }

  /**
   * Get the value of items
   * @return the value of items
   */
  private Citem getItems ( ) {
    return items;
  }

  /**
   * Set the value of private_box
   * @param newVar the new value of private_box
   */
  private void setPrivate_box ( Citem newVar ) {
    private_box = newVar;
  }

  /**
   * Get the value of private_box
   * @return the value of private_box
   */
  private Citem getPrivate_box ( ) {
    return private_box;
  }

  /**
   * Set the value of dead
   * @param newVar the new value of dead
   */
  private void setDead ( boolean newVar ) {
    dead = newVar;
  }

  /**
   * Get the value of dead
   * @return the value of dead
   */
  private boolean getDead ( ) {
    return dead;
  }

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  private void setPosition ( Ccoordinates newVar ) {
    position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  private Ccoordinates getPosition ( ) {
    return position;
  }

  /**
   * Set the value of soul
   * @param newVar the new value of soul
   */
  private void setSoul ( Csoul newVar ) {
    soul = newVar;
  }

  /**
   * Get the value of soul
   * @return the value of soul
   */
  private Csoul getSoul ( ) {
    return soul;
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

  /**
   * Set the value of combat_ability
   * @param newVar the new value of combat_ability
   */
  private void setCombat_ability ( uint32_t newVar ) {
    combat_ability = newVar;
  }

  /**
   * Get the value of combat_ability
   * @return the value of combat_ability
   */
  private uint32_t getCombat_ability ( ) {
    return combat_ability;
  }

  /**
   * Set the value of armor
   * @param newVar the new value of armor
   */
  private void setArmor ( uint32_t newVar ) {
    armor = newVar;
  }

  /**
   * Get the value of armor
   * @return the value of armor
   */
  private uint32_t getArmor ( ) {
    return armor;
  }

  //
  // Other methods
  //

  /**
   */
  public void kill(  )
  {
  }


}
