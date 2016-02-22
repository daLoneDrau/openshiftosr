package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.RandomOutcomeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface RandomOutcomeRepository 
extends CrudRepository<RandomOutcomeEntity, Long> {

}
