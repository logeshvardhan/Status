/**
 * 
 */
package com.quapt.myf4h.product.repository;

import com.quapt.myf4h.product.domain.Status;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author user20
 *
 */
@Repository
public interface StatusRepository extends MongoRepository<Status, Serializable>{

}
