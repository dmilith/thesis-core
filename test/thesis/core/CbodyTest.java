package thesis.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public class CbodyTest extends Cobject implements WorldAttributes {

    Cbody cos, cos2;
    Cobject root;
    Citem specifiedItem;

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
        specifiedItem = new Citem();
        specifiedItem.setName("Brush");
        cos.addItem( new Citem() );
        cos.addItem( specifiedItem );
        cos2.addItem( new Citem() );
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
     * Test of name generator
     */
    @Test
    public void testGenerateFemaleName() {
        Date time_now = null;
        Date time_after = null;
        long time = 0;
        for ( int j = 0; j < 10; j++ ) { // warming up
          time_now = new Date();
          for ( int i = 0; i< 4000; i++) cos.generateName( Esex.Female );
          time_after = new Date();
          time = time_after.getTime() - time_now.getTime();
        }
        assertTrue( time <= 250 ); // 0.20s for 4000 names as maximum
        System.out.println( "Przed: " + time_now.getTime() );
        System.out.println( "Po: " + time_after.getTime() );
        System.out.println( "CZAS w ms: " + time );
    }


    /**
     * Test of name generator
     */
    @Test
    public void testGenerateMaleName() {
        Date time_now = null;
        Date time_after = null;
        long time = 0;
        for ( int j = 0; j < 10; j++ ) { // warming up
          time_now = new Date();
          for ( int i = 0; i< 4000; i++) cos.generateName( Esex.Male );
          time_after = new Date();
          time = time_after.getTime() - time_now.getTime();
        }
        assertTrue( time <= 250 ); // 0.20s for 4000 names as maximum
        System.out.println( "Przed: " + time_now.getTime() );
        System.out.println( "Po: " + time_after.getTime() );
        System.out.println( "CZAS w ms: " + time );
    }

    /**
     * Test of name generator
     */
    @Test
    public void testGenerateHermaphroditeName() {
        Date time_now = null;
        Date time_after = null;
        long time = 0;
        for ( int j = 0; j < 10; j++ ) { // warming up
          time_now = new Date();
          for ( int i = 0; i< 4000; i++) cos.generateName( Esex.Hermaphrodite );
          time_after = new Date();
          time = time_after.getTime() - time_now.getTime();
          assertTrue( time <= 250 ); // 0.20s for 4000 names as maximum
        }
        System.out.println( "Przed: " + time_now.getTime() );
        System.out.println( "Po: " + time_after.getTime() );
        System.out.println( "CZAS w ms: " + time );
    }

    @Test
    public void testGeneratorOutput() {
        System.out.println("generate name");
        int amount = 0;
        assertNotNull( cos );
        for ( int i = 0; i< 2500; i++) {
            System.out.print( cos.generateName( Esex.Male ) + ", " );
            assertNotNull( cos.generateName( Esex.Male ));
            ++amount;
        }
        System.out.println( "\n\n***********************************\n");
        for ( int i = 0; i< 2500; i++) {
            System.out.print( cos.generateName( Esex.Female ) + ", " );
            assertNotNull( cos.generateName( Esex.Female ));
            ++amount;
        }
        System.out.println( "\n\n***********************************\n");
        for ( int i = 0; i< 2500; i++) {
            System.out.print( cos.generateName( Esex.Hermaphrodite ) + ", " );
            assertNotNull( cos.generateName( Esex.Hermaphrodite ));
        }
        System.out.println( "Ilość imion: " + amount );
        assertTrue( amount >= 5000 ); // at least 5000 names
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
    public void testGetAddItem1() {
        System.out.println("getAddItem1");
        assertNotNull( cos.getItemsVector() );
        assertNotNull( cos.getFirstItem() );
        assertNotNull( cos2.getFirstItem() );
        assertTrue( cos.getItemsVector().size() == 2 );
        assertTrue( cos2.getItemsVector().size() == 1 );
        cos2.removeItem( cos2.getFirstItem() );
        assertTrue( cos2.getItemsVector().size() == 0 );
        assertEquals( cos.getItem(1).getName(), "Brush" );
        Citem temp = new Citem();
        temp = cos.getFirstItem();
        cos.removeItem( temp );
        assertEquals( cos.getFirstItem().getName(), "Brush" );
    }

    /**
     * Test of getItems method, of class Cbody.
     */
    @Test
    public void testGive() {
        System.out.println("getGive");
        Citem itemA = cos.getItem(0);
        Citem itemB = cos.getItem(1);
        cos.give( cos2, cos.getItem(0) );
        assertEquals( itemA.getUUID(), cos2.getItem( cos2.getItemsVector().size() - 1 ).getUUID() );
        assertNotSame( cos.getItem(0).getUUID(), itemA.getUUID() );
        assertEquals( cos.getItem(0).getUUID(), itemB.getUUID() );
        assertTrue( cos2.getItemsVector().size() == 2 );
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
        cos.kill();
        assertTrue( cos.isDead() );
    }

    /**
     * Test of name generator
     */
    @Test
    public void testRealName() {
        Cbody z = new Cbody();
        System.out.println( z.getName() );
        System.out.println( cos.getName() );
        Cbody zz = new Cbody( Esex.Female );
        System.out.println( zz.getName() );
        Cbody zzy = new Cbody( 25000 );
        System.out.println( zzy.getName() );
    }

    /**
     * Eexperience level test
     */
    @Test
    public void testExperienceLevel() {
        Cbody m = new Cbody();
        assertTrue( m.getExperienceLevel() == EexperienceLevel.Novice );
        m.earnExperience(1000);
        assertTrue( m.getExperienceLevel() == EexperienceLevel.Beginner );
        m.earnExperience(3000);
        assertTrue( m.getExperienceLevel() == EexperienceLevel.Intermediate );
        m.earnExperience(5000);
        assertTrue( m.getExperienceLevel() == EexperienceLevel.Advanced );
        m.earnExperience(40000);
        assertTrue( m.getExperienceLevel() == EexperienceLevel.Expert );
        m.earnExperience(100000);
        assertTrue( m.getExperienceLevel() == EexperienceLevel.God );
    }


}