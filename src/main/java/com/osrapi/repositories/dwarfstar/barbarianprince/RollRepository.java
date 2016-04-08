package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.RollEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface RollRepository 
extends CrudRepository<RollEntity, Long> {

}
