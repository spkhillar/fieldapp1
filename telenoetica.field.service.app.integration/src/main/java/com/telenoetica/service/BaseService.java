package com.telenoetica.service;

import com.telenoetica.jpa.entities.BaseEntity;


public interface BaseService<E extends BaseEntity>{

	public E retrieve(Long id);
	
	public E saveOrUpdate(E baseEntity);

	public void delete(E baseEntity);
}
