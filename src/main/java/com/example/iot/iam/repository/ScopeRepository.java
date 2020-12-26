package com.example.iot.iam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.iot.iam.entity.Scope;

@RepositoryRestResource()
public interface ScopeRepository extends JpaRepository<Scope, Integer>, JpaSpecificationExecutor<Scope>, QuerydslPredicateExecutor<Scope> {}
