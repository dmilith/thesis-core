package thesis.core;

import java.util.Vector;

/**
 * Class CJob
 */
public class Cjob extends Cobject implements WorldAttributes {


  private EActionType actionType;
  private Vector<Cobject> actors;
  private int jobFlags;

  /**
   * done will store status of current job. if it's true then it's job which is already done.
   */
  boolean done;
  boolean pending;


  //
  // Constructors
  //
  public Cjob( boolean anything ) {
  }

  /**
   * creating job with two actors, with defined action
   */

  // Job for all objects interactions
  public Cjob( Cobject first, Cobject second[], EActionType actionToDoType, int flags ) {
        super();
        this.setJobFlags( 0 ); // no special flags
        this.done = false; // new job, need to do run() to start a job
        this.setObjectType( Cjob.class );
        this.setActor( first, 0 );
        for ( int i = 1; i < second.length; ++i ) {
            this.setActor( second[ i - 1 ], i );
        }
  };

  // Methods
  //
  
  public void runJob() {
        switch( actionType ) {
            case ActionAttack: {
              // TODO FIXME : add actions
            } break;
            case ActionRun: {
              
            } break;
            default: {

            } break;
        }

  }
  //
  // Accessor methods
  //

  // job is pending?
  public boolean isPending() {
    return pending;
  }

  public void setPending(boolean pending) {
    this.pending = pending;
  }

  /**
   * Set the value of actors_
   * @param newVar the new value of actors_
   */
  public void setActor ( Cobject newVar, int whichOne ) {
    this.actors.add( whichOne, newVar );
  }

  /**
   * Get the value of actors_
   * @return the value of actors_
   */
  public Cobject getActor ( int whichOne ) {
    return this.actors.elementAt( whichOne );
  }

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
