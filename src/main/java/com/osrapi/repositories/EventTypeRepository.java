package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.EventTypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface EventTypeRepository 
extends CrudRepository<EventTypeEntity, Long> {

}
