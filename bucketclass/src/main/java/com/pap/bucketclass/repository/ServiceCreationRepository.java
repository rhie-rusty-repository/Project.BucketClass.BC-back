package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceCreation;

@Repository
public interface ServiceCreationRepository extends JpaRepository<ServiceCreation, Long>{
	ServiceCreation findByServiceId(Long serivce_id);
}
