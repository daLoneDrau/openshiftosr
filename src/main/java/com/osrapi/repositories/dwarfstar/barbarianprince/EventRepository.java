package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.EventEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface EventRepository extends CrudRepository<EventEntity, Long> {

}
