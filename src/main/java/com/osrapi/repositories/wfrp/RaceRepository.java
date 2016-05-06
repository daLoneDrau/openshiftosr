package com.osrapi.repositories.wfrp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.wfrp.WFRPRaceEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface RaceRepository 
extends CrudRepository<WFRPRaceEntity, Long> {

}
