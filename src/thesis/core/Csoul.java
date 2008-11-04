package thesis.core;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public class Csoul extends Cobject {

    private boolean online;
    private int mana;
    private int mindStrength;

    public Csoul( boolean something ) {
    }

    public Csoul() {
        super();
        this.setObjectType( Csoul.class );
        this.online = false;
        this.mana = 0;
        this.mindStrength = 0;
    }


    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMindStrength() {
        return mindStrength;
    }

    public void setMindStrength(int mindStrength) {
        this.mindStrength = mindStrength;
    }

    public boolean isOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    
}
