package thesis.core;

import java.util.Date;
import java.util.UUID;

public class Cobject { //extends Rdb4oBase {

  public static final boolean debug = true;

  private UUID uuid;
  /* parent it's uuid of object's parent */
  private UUID parent;
  private Date createdAt;


  public Cobject() {
      this.uuid = UUID.randomUUID();
  }

  public Cobject( boolean foo ) { // to get clean Cobject without UUID
  }

  public Cobject( UUID new_uuid ) {
      this.uuid = new_uuid;
  }

  public Cobject( UUID new_uuid, UUID new_parent ) {
      this.uuid = new_uuid;
      this.parent = new_parent;
  }

  public Cobject( UUID new_uuid, UUID new_parent, Date new_date ) {
      this.uuid = new_uuid;
      this.parent = new_parent;
      this.createdAt = new_date;
  }

  public Cobject( String new_uuid ) {
      this.uuid = UUID.fromString(new_uuid);
  }

  public Cobject( String new_uuid, String new_parent ) {
      this.uuid = UUID.fromString(new_uuid);
      this.parent = UUID.fromString(new_parent);
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
