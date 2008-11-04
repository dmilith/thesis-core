package thesis.core;

import java.util.HashMap;

/**
 * Class Ccore
 */
public class Ccore extends Cobject {

    // here we have world rules.
  private String databaseVersion;
  private HashMap<String, Integer> preferences;

  public Ccore( boolean anything ) {
  }

  public Ccore() {
        super();
        this.setObjectType( Ccore.class );
        this.preferences = new HashMap<String, Integer>();
        
  };

  public String getDatabaseVersion() {
      return databaseVersion;
  }

  public void setDatabaseVersion(String databaseVersion) {
      this.databaseVersion = databaseVersion;
  }

  public HashMap<String, Integer> getPreferences() {
      return preferences;
  }

  public void setPreferences(HashMap<String, Integer> preferences) {
      this.preferences = preferences;
  }

}