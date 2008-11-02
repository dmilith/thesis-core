/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thesis.core;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public class Csoul extends Cobject {

    private boolean online = false;
    private int mana;
    private int mindStrength;

    public Csoul() {
        super();
        this.setObjectType( Csoul.class );
        this.mana = 0;
        this.mindStrength = 0;
    }


    public int getMana() {
        return mana;
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
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    
}
