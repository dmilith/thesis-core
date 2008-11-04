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
  private int speed; // speed of actor, means how fast he will move

  //
  // Constructors
  //

  public Cbody( boolean anything ) {   
  }

  public Cbody () {
        super();
        this.setObjectType( Cbody.class );
        this.setName("Richard");
  };
  
  //
  // Methods
  //


  //
  // Action methods
  //

  /**
   * attack an opponent
   * @param newVar the new value of health
   */
  public void attack( Cbody enemy ) {
    // TODO FIXME: debug only calculation:
    enemy.setHealth( enemy.getHealth() - this.strength );
  }

  /**
   * attack an opponent
   * @param newVar the new value of health
   */
  public void move( Ccoordinates target ) {
    // TODO FIXME: move without any validations:
    this.position = target;
  }

  //
  // Setters and Getters
  //
  
  /**
   * Set the value of health
   * @param newVar the new value of health
   */
  public void setHealth ( int newVar ) {
    this.health = newVar;
  }

  /**
   * Get the value of health
   * @return the value of health
   */
  public int getHealth ( ) {
    return this.health;
  }

  /**
   * Set the value of race
   * @param newVar the new value of race
   */
  public void setRace ( int newVar ) {
    this.race = newVar;
  }

  /**
   * Get the value of race
   * @return the value of race
   */
  public int getRace ( ) {
    return this.race;
  }

  /**
   * Set the value of inteligence
   * @param newVar the new value of inteligence
   */
  public void setInteligence ( int newVar ) {
    this.inteligence = newVar;
  }

  /**
   * Get the value of inteligence
   * @return the value of inteligence
   */
  public int getInteligence ( ) {
    return this.inteligence;
  }

  /**
   * Set the value of strength
   * @param newVar the new value of strength
   */
  public void setStrength ( int newVar ) {
    this.strength = newVar;
  }

  /**
   * Get the value of strength
   * @return the value of strength
   */
  public int getStrength ( ) {
    return this.strength;
  }

  /**
   * Set the value of dexterity
   * @param newVar the new value of dexterity
   */
  public void setDexterity ( int newVar ) {
    this.dexterity = newVar;
  }

  /**
   * Get the value of dexterity
   * @return the value of dexterity
   */
  public int getDexterity ( ) {
    return this.dexterity;
  }

  /**
   * Set the value of mind_strength
   * @param newVar the new value of mind_strength
   */
  public void setMindStrength ( int newVar ) {
    this.mindStrength = newVar;
  }

  /**
   * Get the value of mind_strength
   * @return the value of mind_strength
   */
  public int getMindStrength ( ) {
    return this.mindStrength;
  }

  /**
   * Set the value of gold
   * @param newVar the new value of gold
   */
  public void setGold ( long newVar ) {
    this.gold = newVar;
  }

  /**
   * Get the value of gold
   * @return the value of gold
   */
  public long getGold ( ) {
    return this.gold;
  }

  /**
   * Set the value of age
   * @param newVar the new value of age
   */
  public void setAge ( int newVar ) {
    this.age = newVar;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  public int getAge ( ) {
    return this.age;
  }

  /**
   * Set the value of luck
   * @param newVar the new value of luck
   */
  public void setLuck ( int newVar ) {
    this.luck = newVar;
  }

  /**
   * Get the value of luck
   * @return the value of luck
   */
  public int getLuck ( ) {
    return this.luck;
  }

  /**
   * Set the value of items
   * @param newVar the new value of items
   */
  public void setItems ( Citem newVar ) {
    this.items = newVar;
  }

  /**
   * Get the value of items
   * @return the value of items
   */
  public Citem getItems ( ) {
    return this.items;
  }

  /**
   * Set the value of privateBox
   * @param newVar the new value of public_box
   */
    public void setPrivateBox(Citem privateBox) {
        this.privateBox = privateBox;
    }

  /**
   * Get the value of privateBox
   * @return the value of public_box
   */
    public Citem getPrivateBox() {
        return privateBox;
    }

  /**
   * Set the value of dead
   * @param newVar the new value of dead
   */
  public void setDead ( boolean newVar ) {
    this.dead = newVar;
  }

  /**
   * Get the value of dead
   * @return the value of dead
   */
  public boolean getDead ( ) {
    return this.dead;
  }

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  public void setPosition ( Ccoordinates newVar ) {
    this.position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  public Ccoordinates getPosition ( ) {
    return this.position;
  }

  /**
   * Set the value of soul
   * @param newVar the new value of soul
   */
  public void setSoul ( Csoul newVar ) {
    this.soul = newVar;
  }

  /**
   * Get the value of soul
   * @return the value of soul
   */
  public Csoul getSoul ( ) {
    return this.soul;
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

  /**
   * Set the value of combat_ability
   * @param newVar the new value of combat_ability
   */
  public void setCombatAbility ( int newVar ) {
    this.combatAbility = newVar;
  }

  /**
   * Get the value of combat_ability
   * @return the value of combat_ability
   */
  public int getCombat_ability ( ) {
    return combatAbility;
  }

  /**
   * Set the value of armor
   * @param newVar the new value of armor
   */
  public void setArmor ( int newVar ) {
    this.armor = newVar;
  }

  /**
   * Get the value of armor
   * @return the value of armor
   */
  public int getArmor ( ) {
    return this.armor;
  }

  /**
   * Get the value of speed
   * @return the value of speed
   */
  public int getSpeed() {
      return speed;
  }

  /**
   * Set the value of speed
   * @return void
   */
  public void setSpeed(int speed) {
      this.speed = speed;
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
