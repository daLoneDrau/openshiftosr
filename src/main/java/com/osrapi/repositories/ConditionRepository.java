package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.ConditionEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface ConditionRepository 
extends CrudRepository<ConditionEntity, Long> {

}
