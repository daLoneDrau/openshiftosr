package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.HumanoidRaceEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HumanoidRaceRepository 
extends CrudRepository<HumanoidRaceEntity, Long> {

}
