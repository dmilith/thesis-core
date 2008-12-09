package thesis.core;

import java.util.Vector;

/**
 * Class CJob
 */
public class Cjob extends Cobject implements WorldAttributes, Runnable {


  private EActionType actionType;
  private Vector<Cobject> actors;
  private int jobFlags;

  /**
   * done will store status of current job. if it's true then it's job which is already done.
   */


  //
  // Constructors
  //
  Cjob( boolean anything ) {
  }

  /**
   * creating job with two actors, with defined action
   */

  // Job for all objects interactions
  Cjob( final Cobject first, final Cobject second, final EActionType actionToDoType, final int flags ) {
        super();
        this.jobFlags = flags; // additional flags given to the job
        this.setObjectType( Cjob.class );
        this.actors = new Vector<Cobject>(2);
        this.actionType = actionToDoType;
        this.actors.add( 0, first );
        this.actors.add( 1, second );
  };

  Cjob( final Cobject first, final Cobject second, final Cobject third, final EActionType actionToDoType, final int flags ) {
        super();
        this.jobFlags = flags; // additional flags given to the job
        this.setObjectType( Cjob.class );
        this.actors = new Vector<Cobject>(3);
        this.actionType = actionToDoType;
        this.actors.add( 0, first );
        this.actors.add( 1, second );
        this.actors.add( 2, third );
  };

  // Methods
  //

  @Override
  public void run() {
        try {
            switch( this.actionType ) {
                case ActionAttack: {
                  // attack could be done only with Cbody vs Cbody
                  ((Cbody)(this.actors.elementAt( 0 ))).attack( (Cbody)this.actors.elementAt( 1 ) );
              } break;
              case ActionWalk: {
                  // walk could be done only with Cbody vs Ccoordinates

              } break;
              case ActionRun: {
                  // walk could be done only with Cbody vs Ccoordinates

              } break;
              case ActionTake: {
                  // take could be done only with Cbody(source) Cbody(target) and Citem(from source Cbody)

              } break;
              case ActionGive: {
                  // give could be done only with Cbody(source) Cbody(target) and Citem(from source Cbody)

              } break;
              case ActionThrow: {
                  //  could be done only with Cbody vs Citem, flags will keep direction and other info
                
              } break;
              default: {
                  return; // no such Action? Job is a fake? Error?
              }
            }

        } catch( Exception e ) {
            System.out.println("Exception in Cjob caught. Job UUID: " + this.getUUID() + "\nException: " + e );
        }
        setActive( false ); // job's done!
  }
  //
  // Accessor methods
  //

  /**
   * Set the value of job_flags
   * @param newVar the new value of job_flags
   */
  public void setJobFlags ( int newVar ) {
    this.jobFlags = newVar;
  }

  /**
   * Get the value of job_flags
   * @return the value of job_flags
   */
  public int getJobFlags ( ) {
    return this.jobFlags;
  }

  //
  // Other methods
  //

}
