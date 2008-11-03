package thesis.core;

/**
 * Class Ccharacter
 */
public class Cbody extends Cobject {

  //
  // Fields
  //
  private int health;
  private int race;
  private int inteligence;
  private int strength;
  private int dexterity;
  private int mindStrength;
  private long gold;
  private int age;
  private int luck;
  private Citem items;
  private Citem privateBox;
  private boolean dead;
  private Ccoordinates position;
  private Csoul soul;
  private String name;
  private int combatAbility;
  private int armor;
  
  //
  // Constructors
  //
  public Cbody () {
  };
  
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
  private void setHealth ( int newVar ) {
    this.health = newVar;
  }

  /**
   * Get the value of health
   * @return the value of health
   */
  private int getHealth ( ) {
    return this.health;
  }

  /**
   * Set the value of race
   * @param newVar the new value of race
   */
  private void setRace ( int newVar ) {
    this.race = newVar;
  }

  /**
   * Get the value of race
   * @return the value of race
   */
  private int getRace ( ) {
    return this.race;
  }

  /**
   * Set the value of inteligence
   * @param newVar the new value of inteligence
   */
  private void setInteligence ( int newVar ) {
    this.inteligence = newVar;
  }

  /**
   * Get the value of inteligence
   * @return the value of inteligence
   */
  private int getInteligence ( ) {
    return this.inteligence;
  }

  /**
   * Set the value of strength
   * @param newVar the new value of strength
   */
  private void setStrength ( int newVar ) {
    this.strength = newVar;
  }

  /**
   * Get the value of strength
   * @return the value of strength
   */
  private int getStrength ( ) {
    return this.strength;
  }

  /**
   * Set the value of dexterity
   * @param newVar the new value of dexterity
   */
  private void setDexterity ( int newVar ) {
    this.dexterity = newVar;
  }

  /**
   * Get the value of dexterity
   * @return the value of dexterity
   */
  private int getDexterity ( ) {
    return this.dexterity;
  }

  /**
   * Set the value of mind_strength
   * @param newVar the new value of mind_strength
   */
  private void setMindStrength ( int newVar ) {
    this.mindStrength = newVar;
  }

  /**
   * Get the value of mind_strength
   * @return the value of mind_strength
   */
  private int getMindStrength ( ) {
    return this.mindStrength;
  }

  /**
   * Set the value of gold
   * @param newVar the new value of gold
   */
  private void setGold ( long newVar ) {
    this.gold = newVar;
  }

  /**
   * Get the value of gold
   * @return the value of gold
   */
  private long getGold ( ) {
    return this.gold;
  }

  /**
   * Set the value of age
   * @param newVar the new value of age
   */
  private void setAge ( int newVar ) {
    this.age = newVar;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  private int getAge ( ) {
    return this.age;
  }

  /**
   * Set the value of luck
   * @param newVar the new value of luck
   */
  private void setLuck ( int newVar ) {
    this.luck = newVar;
  }

  /**
   * Get the value of luck
   * @return the value of luck
   */
  private int getLuck ( ) {
    return this.luck;
  }

  /**
   * Set the value of items
   * @param newVar the new value of items
   */
  private void setItems ( Citem newVar ) {
    this.items = newVar;
  }

  /**
   * Get the value of items
   * @return the value of items
   */
  private Citem getItems ( ) {
    return this.items;
  }

  /**
   * Set the value of private_box
   * @param newVar the new value of private_box
   */
  private void setPrivateBox ( Citem newVar ) {
    this.privateBox = newVar;
  }

  /**
   * Get the value of private_box
   * @return the value of private_box
   */
  private Citem getPrivateBox ( ) {
    return this.privateBox;
  }

  /**
   * Set the value of dead
   * @param newVar the new value of dead
   */
  private void setDead ( boolean newVar ) {
    this.dead = newVar;
  }

  /**
   * Get the value of dead
   * @return the value of dead
   */
  private boolean getDead ( ) {
    return this.dead;
  }

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  private void setPosition ( Ccoordinates newVar ) {
    this.position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  private Ccoordinates getPosition ( ) {
    return this.position;
  }

  /**
   * Set the value of soul
   * @param newVar the new value of soul
   */
  private void setSoul ( Csoul newVar ) {
    this.soul = newVar;
  }

  /**
   * Get the value of soul
   * @return the value of soul
   */
  private Csoul getSoul ( ) {
    return this.soul;
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

  /**
   * Set the value of combat_ability
   * @param newVar the new value of combat_ability
   */
  private void setCombatAbility ( int newVar ) {
    this.combatAbility = newVar;
  }

  /**
   * Get the value of combat_ability
   * @return the value of combat_ability
   */
  private int getCombat_ability ( ) {
    return combatAbility;
  }

  /**
   * Set the value of armor
   * @param newVar the new value of armor
   */
  private void setArmor ( int newVar ) {
    this.armor = newVar;
  }

  /**
   * Get the value of armor
   * @return the value of armor
   */
  private int getArmor ( ) {
    return this.armor;
  }

  //
  // Other methods
  //

  /**
   */
  public void kill(  ) {
      this.dead = true;
  }


}
