/* Copyright (C) 2013 Telenoetica, Inc. All rights reserved */
package com.telenoetica.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telenoetica.jpa.entities.Site;

public interface SiteDAO extends JpaRepository<Site, Long> {

  Site findByName(String name);
}
