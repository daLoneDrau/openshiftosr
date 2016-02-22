package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.HexRoadEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexRoadRepository 
extends CrudRepository<HexRoadEntity, Long> {

}
