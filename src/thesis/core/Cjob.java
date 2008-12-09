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
  boolean pending;


  //
  // Constructors
  //
  Cjob( boolean anything ) {
  }

  /**
   * creating job with two actors, with defined action
   */

  // Job for all objects interactions
  Cjob( Cobject first, Cobject second, EActionType actionToDoType, int flags ) {
        super();
        this.setJobFlags( flags ); // additional flags given to the job
        this.setObjectType( Cjob.class );
        this.actors = new Vector<Cobject>(2);
        this.actionType = actionToDoType;
        this.setPending( false );
        this.actors.addElement( first );
        this.actors.addElement( second );
  };

  // Methods
  //

  @Override
  public void run() {
        try {
          setPending( true );
            switch( this.actionType ) {
                case ActionAttack: {
                // TODO FIXME : add actions
              } break;
              case ActionRun: {

              } break;
              default: {
                return; // no such Action? Job is a fake? Error?
              }
            }
          
        } catch( Exception e ) {
            System.out.println("Exception in Cjob caught. Job UUID: " + this.getUUID() + "\nException: " + e );
        }
        setPending( false );
        setActive( false ); // job's done!
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
