/* Copyright (C) 2013 Telenoetica, Inc. All rights reserved */
package com.telenoetica.jpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Site
 */
@Entity
@Table(name = "site")
@JsonAutoDetect(JsonMethod.NONE)
public class Site implements BaseEntity, java.io.Serializable {

  
  private static final long serialVersionUID = -8172399414155973257L;
  
  @JsonProperty
  private Long id;
  
  private Integer version;
  
  @JsonProperty
  private String name;
  
  @JsonProperty
  private String state;
  
  @JsonProperty
  private Date createdAt=new Date();

  public Site() {}

  public Site(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Site(String name,String state, Date createdAt) {
    this.name = name;
    this.createdAt = createdAt;
    this.state=state;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", unique = true, nullable = false)
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Version
  @Column(name = "version")
  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Column(name = "name", length = 250)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @Column(name = "state", length = 100)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", nullable = false, length = 19)
  public Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Site other = (Site) obj;
    if (createdAt == null) {
      if (other.createdAt != null)
        return false;
    } else if (!createdAt.equals(other.createdAt))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Site [");
    if (id != null)
      builder.append("id=").append(id).append(", ");
    if (version != null)
      builder.append("version=").append(version).append(", ");
    if (name != null)
      builder.append("name=").append(name).append(", ");
    if (state != null)
      builder.append("state=").append(state).append(", ");
    if (createdAt != null)
      builder.append("createdAt=").append(createdAt);
    builder.append("]");
    return builder.toString();
  }
  

}
