package com.bloodmap.repository;

import com.bloodmap.model.BloodRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRequestRepository extends MongoRepository<BloodRequest,String> {
}

