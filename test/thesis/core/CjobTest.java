/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author dmilith
 */
public class CjobTest extends Cobject implements WorldAttributes {

  Cjob job;
  Cobject actor1, actor2, actor3, actor4;
  Csoul soul1, soul2;
  Cbody body1, body2;

    public CjobTest() {
    }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

    @Before
    public void setUp() {
      System.gc();
      soul1 = new Csoul();
      soul2 = new Csoul();
      body1 = new Cbody();
      body1.setParent( soul1.getUUID() );
      body2 = new Cbody();
      body2.setParent( soul2.getUUID() );
      job = new Cjob( false );
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testActors() {
      assertEquals( body1.getObjectType().toString(), "class thesis.core.Cbody" );
      assertEquals( ((Cobject)body1).getObjectType().toString(), "class thesis.core.Cbody" );
      actor1 = (Cobject)body1;
      actor2 = (Cobject)body2;
      assertEquals( actor1.getObjectType().toString(), "class thesis.core.Cbody" );
      assertEquals( actor2.getObjectType().toString(), "class thesis.core.Cbody" );
      actor3 = new Cobject();
      assertEquals( actor3.getObjectType().toString(), "class thesis.core.Cobject" );

      job = new Cjob( (Cobject)body1, (Cobject)body2, EActionType.ActionAttack, 0 );
      assertNotNull( job );
      assertTrue( job.isActive() );
      int hth = body2.getHealth();
      assertNotNull( job.getUUID() );
      job.run();
      assertEquals( body2.getHealth(), hth - body1.getStrength() );
      assertNotNull( job );
      assertTrue( !job.isActive() );
    }

    @Test
    public void testMassAttackJob() {
      Date time_now = null;
      Date time_after = null;
      for (int j = 0; j < 50; j++ ) {
        long time = 0;
        time_now = new Date();
        Cobject zz1 = (Cobject)body1;
        Cobject zz2 = (Cobject)body2;
        for ( int i = 0; i < 10000; i++ ) {
          job = new Cjob( zz1, zz2, EActionType.ActionAttack, 0 );
        }
        time_after = new Date();
        time = time_after.getTime() - time_now.getTime();
        assertTrue( time <= 650 );
        System.out.println( "AJ Przed: " + time_now.getTime() );
        System.out.println( "AJ Po: " + time_after.getTime() );
        System.out.println( "AJ CZAS w ms: " + time );
      }
    }

    @Test
    public void testMassWalkJob() {
      Date time_now = null;
      Date time_after = null;
      for (int j = 0; j < 50; j++ ) {
        long time = 0;
        time_now = new Date();
        for ( int i = 0; i < 20000; i++ ) {
          job = new Cjob( (Cobject)body1, (Cobject)body2, EActionType.ActionWalk, 0 );
        }
        time_after = new Date();
        time = time_after.getTime() - time_now.getTime();
        assertTrue( time <= 350 );
        System.out.println( "WJ Przed: " + time_now.getTime() );
        System.out.println( "WJ Po: " + time_after.getTime() );
        System.out.println( "WJ CZAS w ms: " + time );
      }
    }

}
