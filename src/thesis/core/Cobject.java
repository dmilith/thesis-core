package thesis.core;

import java.util.Date;
import java.util.UUID;

/*
 * Cobject Class is main class for all objects in Thesis
 */
public class Cobject {

  public static final boolean debug = true;

  /* unique identifier */
  private UUID uuid;
  /* parent it's uuid of object's parent */
  private UUID parent;
  /* time of creation */
  private Date createdAt;


  public Cobject( boolean foo ) { // to get clean Cobject stub without UUID
  }

  public Cobject() {
      this.uuid = UUID.randomUUID();
      this.createdAt = new Date();
  }

  public Cobject( UUID new_uuid ) {
      this.uuid = new_uuid;
      this.createdAt = new Date();
  }

  public Cobject( UUID new_uuid, UUID new_parent ) {
      this.uuid = new_uuid;
      this.parent = new_parent;
      this.createdAt = new Date();
  }

  public Cobject( UUID new_uuid, UUID new_parent, Date new_date ) {
      this.uuid = new_uuid;
      this.parent = new_parent;
      this.createdAt = new_date;
  }

  public Cobject( String new_uuid ) {
      this.uuid = UUID.fromString(new_uuid);
      this.createdAt = new Date();
  }

  public Cobject( String new_uuid, String new_parent ) {
      this.uuid = UUID.fromString(new_uuid);
      this.parent = UUID.fromString(new_parent);
      this.createdAt = new Date();
  }

  public Cobject( String new_uuid, String new_parent, Date new_date ) {
      this.uuid = UUID.fromString(new_uuid);
      this.parent = UUID.fromString(new_parent);
      this.createdAt = new_date;
  }


  public void setUUID(UUID new_uuid) {
      this.uuid = new_uuid;
  }

  public void setUUID(String new_uuid) {
      this.uuid = UUID.fromString(new_uuid);
  }

  public UUID getUUID() {
      return this.uuid;
  }

  public void setParent(UUID new_uuid) {
      this.parent = new_uuid;
  }

  public void setParent(String new_uuid) {
      this.parent = UUID.fromString(new_uuid);
  }

  public UUID getParent() {
      return this.parent;
  }

  public void setCreatedAt(Date new_date) {
      this.createdAt = new_date;
  }

  public Date getCreatedAt() {
      return this.createdAt;
  }
}
