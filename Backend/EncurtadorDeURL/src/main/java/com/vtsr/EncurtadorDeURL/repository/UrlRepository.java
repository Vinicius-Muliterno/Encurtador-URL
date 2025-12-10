package com.vtsr.EncurtadorDeURL.repository;

import com.vtsr.EncurtadorDeURL.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
