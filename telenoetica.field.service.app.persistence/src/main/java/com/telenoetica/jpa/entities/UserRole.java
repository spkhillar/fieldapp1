/* Copyright (C) 2013 Telenoetica, Inc. All rights reserved */
package com.telenoetica.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserRole
 */
@Entity
@Table(name = "user_role")
public class UserRole implements java.io.Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 6247808108412977322L;
  private Long id;
  private User user;
  private Role role;

  public UserRole() {}

  public UserRole(User user, Role role) {
    this.user = user;
    this.role = role;
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "role_id")
  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("UserRole [");
    if (id != null) {
      builder.append("id=");
      builder.append(id);
      builder.append(", ");
    }
   /* if (user != null) {
      builder.append("user=");
      builder.append(user);
      builder.append(", ");
    }*/
    if (role != null) {
      builder.append("role=");
      builder.append(role);
    }
    builder.append("]");
    return builder.toString();
  }

  
}
