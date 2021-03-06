package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.HexLocationEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexLocationRepository 
extends CrudRepository<HexLocationEntity, Long> {

}
