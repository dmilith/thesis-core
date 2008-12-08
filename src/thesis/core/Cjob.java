package thesis.core;

/**
 * Class CJob
 */
public class Cjob extends Cobject implements WorldAttributes {


  private EbodyActionType actionType;
  private Cbody[] actors;
  private String jobId;
  private int jobFlags;

  /**
   * done will store status of current job. if it's true then it's job which is already done.
   */
  boolean done;


  //
  // Constructors
  //
  public Cjob( boolean anything ) {
  }

  /**
   * creating job with two actors, with defined action
   */
  public Cjob( Cbody first, Cbody second[], EbodyActionType actionToDoType ) {
        super();
        this.done = false; // new job, need to be run()
        this.setObjectType( Cjob.class );
        this.setActor( first, 0 );
        for ( int i = 1; i < second.length; ++i ) {
            this.setActor( second[ i - 1 ], i );
        }
  };
  
  //
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

  /**
   * Set the value of actors_
   * @param newVar the new value of actors_
   */
  public void setActor ( Cbody newVar, int whichOne ) {
    this.actors[ whichOne ] = newVar;
  }

  /**
   * Get the value of actors_
   * @return the value of actors_
   */
  public Cbody getActor ( int whichOne ) {
    return this.actors[ whichOne ];
  }

  /**
   * Set the value of job_id
   * @param newVar the new value of job_id
   */
  public void setJobId ( String newVar ) {
    this.jobId = newVar;
  }

  /**
   * Get the value of job_id
   * @return the value of job_id
   */
  public String getJobId ( ) {
    return this.jobId;
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

  /**
   * crucial method which will run current job.
   */
  public void run( ) {

  }


}
