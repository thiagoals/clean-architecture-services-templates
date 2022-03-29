package com.services.userservice.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.userservice.infrastructure.entities.UserJpaEntity;

@Repository
public interface CreateUserJPARepository extends JpaRepository<UserJpaEntity, Long>{

}
