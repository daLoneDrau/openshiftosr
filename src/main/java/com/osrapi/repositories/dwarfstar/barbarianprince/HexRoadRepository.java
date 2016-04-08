package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.HexRoadEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexRoadRepository 
extends CrudRepository<HexRoadEntity, Long> {

}
