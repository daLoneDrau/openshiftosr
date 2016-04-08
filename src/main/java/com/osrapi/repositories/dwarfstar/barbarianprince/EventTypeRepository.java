package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.EventTypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface EventTypeRepository 
extends CrudRepository<EventTypeEntity, Long> {

}
