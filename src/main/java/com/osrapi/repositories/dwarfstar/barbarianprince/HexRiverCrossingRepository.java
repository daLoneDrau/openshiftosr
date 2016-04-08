package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.HexRiverCrossingEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexRiverCrossingRepository 
extends CrudRepository<HexRiverCrossingEntity, Long> {
	/**
	 * Retrieves a list of river crossings by their crossing points.
	 * @param from the hex coming from
	 * @param to the hex going to
	 * @return {@link HexRiverCrossingEntity}
	 */
	HexRiverCrossingEntity findByToAndFrom(long from, long to);
}
