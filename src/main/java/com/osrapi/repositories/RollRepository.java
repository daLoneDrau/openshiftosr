package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.RollEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface RollRepository 
extends CrudRepository<RollEntity, Long> {

}
