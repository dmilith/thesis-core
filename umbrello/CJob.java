

/**
 * Class CJob
 */
public class CJob {

  //
  // Fields
  //

  private EJobType type;
  private Ccharacter actors_;
  private String job_id;
  private String job_crc;
  private uint32_t job_flags;
  
  //
  // Constructors
  //
  public CJob () { };
  
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
  private void setType ( EJobType newVar ) {
    type = newVar;
  }

  /**
   * Get the value of type
   * @return the value of type
   */
  private EJobType getType ( ) {
    return type;
  }

  /**
   * Set the value of actors_
   * @param newVar the new value of actors_
   */
  private void setActors_ ( Ccharacter newVar ) {
    actors_ = newVar;
  }

  /**
   * Get the value of actors_
   * @return the value of actors_
   */
  private Ccharacter getActors_ ( ) {
    return actors_;
  }

  /**
   * Set the value of job_id
   * @param newVar the new value of job_id
   */
  private void setJob_id ( String newVar ) {
    job_id = newVar;
  }

  /**
   * Get the value of job_id
   * @return the value of job_id
   */
  private String getJob_id ( ) {
    return job_id;
  }

  /**
   * Set the value of job_crc
   * @param newVar the new value of job_crc
   */
  private void setJob_crc ( String newVar ) {
    job_crc = newVar;
  }

  /**
   * Get the value of job_crc
   * @return the value of job_crc
   */
  private String getJob_crc ( ) {
    return job_crc;
  }

  /**
   * Set the value of job_flags
   * @param newVar the new value of job_flags
   */
  private void setJob_flags ( uint32_t newVar ) {
    job_flags = newVar;
  }

  /**
   * Get the value of job_flags
   * @return the value of job_flags
   */
  private uint32_t getJob_flags ( ) {
    return job_flags;
  }

  //
  // Other methods
  //

  /**
   */
  public void run(  )
  {
  }


}
