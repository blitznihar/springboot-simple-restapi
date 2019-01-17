package com.blitznihar.springbootsimplerestapi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface PingDataRepository extends MongoRepository<PingData, String> {

    public PingData findByApplicationName(String applicationName);
    public List<PingData> findByPurpose(String purpose);

}