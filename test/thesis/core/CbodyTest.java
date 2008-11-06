package thesis.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public class CbodyTest {

    Cbody cos, cos2;
    Cobject root;

    public CbodyTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        root = new Cobject();
        cos = new Cbody();
        cos.setStrength(5);
        cos.setHealth(10);
        cos.setParent( root.getUUID() );
        cos2 = new Cbody();
        cos2.setStrength(5);
        cos2.setHealth(10);
        cos.attack( cos2 );

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of attack method, of class Cbody.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        assertNotNull( cos );
        assertTrue( cos.getParent().equals( root.getUUID() ) );
        assertEquals( cos.getParent(), root.getUUID() );
        assertEquals( cos2.getHealth(), 5 );
    }

    /**
     * Test of move method, of class Cbody.
     */
    @Test
    public void testMove() {
        System.out.println("move");
    }

    /**
     * Test of setHealth method, of class Cbody.
     */
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");
    }

    /**
     * Test of getHealth method, of class Cbody.
     */
    @Test
    public void testGetHealth() {
        System.out.println("getHealth");
    }

    /**
     * Test of setRace method, of class Cbody.
     */
    @Test
    public void testSetRace() {
        System.out.println("setRace");
    }

    /**
     * Test of getRace method, of class Cbody.
     */
    @Test
    public void testGetRace() {
        System.out.println("getRace");
    }

    /**
     * Test of setInteligence method, of class Cbody.
     */
    @Test
    public void testSetInteligence() {
        System.out.println("setInteligence");
    }

    /**
     * Test of getInteligence method, of class Cbody.
     */
    @Test
    public void testGetInteligence() {
        System.out.println("getInteligence");
    }

    /**
     * Test of setStrength method, of class Cbody.
     */
    @Test
    public void testSetStrength() {
        System.out.println("setStrength");
    }

    /**
     * Test of getStrength method, of class Cbody.
     */
    @Test
    public void testGetStrength() {
        System.out.println("getStrength");
    }

    /**
     * Test of setDexterity method, of class Cbody.
     */
    @Test
    public void testSetDexterity() {
        System.out.println("setDexterity");
    }

    /**
     * Test of getDexterity method, of class Cbody.
     */
    @Test
    public void testGetDexterity() {
        System.out.println("getDexterity");
    }

    /**
     * Test of setMindStrength method, of class Cbody.
     */
    @Test
    public void testSetMindStrength() {
        System.out.println("setMindStrength");
    }

    /**
     * Test of getMindStrength method, of class Cbody.
     */
    @Test
    public void testGetMindStrength() {
        System.out.println("getMindStrength");
    }

    /**
     * Test of setGold method, of class Cbody.
     */
    @Test
    public void testSetGold() {
        System.out.println("setGold");
    }

    /**
     * Test of getGold method, of class Cbody.
     */
    @Test
    public void testGetGold() {
        System.out.println("getGold");
    }

    /**
     * Test of setAge method, of class Cbody.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
    }

    /**
     * Test of getAge method, of class Cbody.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
    }

    /**
     * Test of setLuck method, of class Cbody.
     */
    @Test
    public void testSetLuck() {
        System.out.println("setLuck");
    }

    /**
     * Test of getLuck method, of class Cbody.
     */
    @Test
    public void testGetLuck() {
        System.out.println("getLuck");
    }

    /**
     * Test of setItems method, of class Cbody.
     */
    @Test
    public void testSetItems() {
        System.out.println("setItems");
    }

    /**
     * Test of getItems method, of class Cbody.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
    }

    /**
     * Test of setPrivateBox method, of class Cbody.
     */
    @Test
    public void testSetPrivateBox() {
        System.out.println("setPrivateBox");
    }

    /**
     * Test of getPrivateBox method, of class Cbody.
     */
    @Test
    public void testGetPrivateBox() {
        System.out.println("getPrivateBox");
    }

    /**
     * Test of setDead method, of class Cbody.
     */
    @Test
    public void testSetDead() {
        System.out.println("setDead");
    }

    /**
     * Test of getDead method, of class Cbody.
     */
    @Test
    public void testGetDead() {
        System.out.println("getDead");
    }

    /**
     * Test of setPosition method, of class Cbody.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
    }

    /**
     * Test of getPosition method, of class Cbody.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
    }

    /**
     * Test of setSoul method, of class Cbody.
     */
    @Test
    public void testSetSoul() {
        System.out.println("setSoul");
    }

    /**
     * Test of getSoul method, of class Cbody.
     */
    @Test
    public void testGetSoul() {
        System.out.println("getSoul");
    }

    /**
     * Test of setName method, of class Cbody.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
    }

    /**
     * Test of getName method, of class Cbody.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
    }

    /**
     * Test of setCombatAbility method, of class Cbody.
     */
    @Test
    public void testSetCombatAbility() {
        System.out.println("setCombatAbility");
    }

    /**
     * Test of getCombat_ability method, of class Cbody.
     */
    @Test
    public void testGetCombat_ability() {
        System.out.println("getCombat_ability");
    }

    /**
     * Test of setArmor method, of class Cbody.
     */
    @Test
    public void testSetArmor() {
        System.out.println("setArmor");
    }

    /**
     * Test of getArmor method, of class Cbody.
     */
    @Test
    public void testGetArmor() {
        System.out.println("getArmor");
    }

    /**
     * Test of getSpeed method, of class Cbody.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
    }

    /**
     * Test of setSpeed method, of class Cbody.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
    }

    /**
     * Test of kill method, of class Cbody.
     */
    @Test
    public void testKill() {
        System.out.println("kill");
    }

}