/* Copyright (C) 2013 Telenoetica, Inc. All rights reserved */

package com.telenoetica.jpa.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = -6457616256442358384L;
  private Long id;
  private String name;
 private String description;
  private Set<RolePermission> rolePermissions = new HashSet<RolePermission>(0);
  private Set<UserRole> userRoles = new HashSet<UserRole>(0);

  public Role() {}

  public Role(String name, Set<RolePermission> rolePermissions, Set<UserRole> userRoles) {
    this.name = name;
    this.rolePermissions = rolePermissions;
    this.userRoles = userRoles;
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

  @Column(name = "name", length = 250)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @Column(name = "description", length = 250)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
  public Set<RolePermission> getRolePermissions() {
    return this.rolePermissions;
  }

  public void setRolePermissions(Set<RolePermission> rolePermissions) {
    this.rolePermissions = rolePermissions;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
  public Set<UserRole> getUserRoles() {
    return this.userRoles;
  }

  public void setUserRoles(Set<UserRole> userRoles) {
    this.userRoles = userRoles;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Role [");
    if (id != null) {
      builder.append("id=");
      builder.append(id);
      builder.append(", ");
    }
    if (name != null) {
      builder.append("name=");
      builder.append(name);
      builder.append(", ");
    }
    if (description != null) {
      builder.append("description=");
      builder.append(description);
    }
    builder.append("]");
    return builder.toString();
  }
  
  

}
