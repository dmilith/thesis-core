package thesis.core;

/**
 * Class CJob
 */
public class Cjob extends Cobject {

  //
  // Fields
  //

  private int type;
  private Cbody[] actors;
  private String jobId;
//  private String jobCrc;
  private int jobFlags;
  
  //
  // Constructors
  //
  public Cjob () {
        super();
        this.setObjectType( Cjob.class );
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of type
   * @param newVar the new value of type
   */
  public void setType ( int newVar ) {
    this.type = newVar;
  }

  /**
   * Get the value of type
   * @return the value of type
   */
  public int getType ( ) {
    return this.type;
  }

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
