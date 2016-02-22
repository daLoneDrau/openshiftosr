package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.EventEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface EventRepository extends CrudRepository<EventEntity, Long> {

}
