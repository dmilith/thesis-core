/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thesis.core;

import java.util.UUID;
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
public class CcoordinatesTest {
    
    Ccoordinates z;

    public CcoordinatesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        z = new Ccoordinates();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPositionOf method, of class Ccoordinates.
     */
    @Test
    public void testGetPositionOf() {
        System.out.println("getPositionOf");
        for ( int i = 0; i < 5; ++i )
            assertNull( z.getPositionOf( i ) );
        assertNotNull( z.getUUID() );
    }

    /**
     * Test of setPositionOf method, of class Ccoordinates.
     */
    @Test
    public void testSetPositionOf() {
        System.out.println("setPositionOf");
        for ( int i = 0; i < 5; ++i )
            z.setPositionOf( UUID.randomUUID(), i );
        assertNotNull( z.getUUID() );
        for ( int i = 0; i < 5; ++i )
            assertNotNull( z.getPositionOf(i) );

    }

}