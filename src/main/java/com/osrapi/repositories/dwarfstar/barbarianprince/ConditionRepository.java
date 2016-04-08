package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.ConditionEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface ConditionRepository 
extends CrudRepository<ConditionEntity, Long> {

}
