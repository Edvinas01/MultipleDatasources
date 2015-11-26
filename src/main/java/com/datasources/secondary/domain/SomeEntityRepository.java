package com.datasources.secondary.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository("secondaryRepository")
public interface SomeEntityRepository extends JpaRepository<SomeEntity, Long>, JpaSpecificationExecutor<SomeEntity> {
}