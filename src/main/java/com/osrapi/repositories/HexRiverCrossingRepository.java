package com.osrapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.BPCharacterEntity;
import com.osrapi.models.HexRiverCrossingEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexRiverCrossingRepository 
extends CrudRepository<HexRiverCrossingEntity, Long> {
	/**
	 * Retrieves a list of river crossings by their name.
	 * @param name the name
	 * @return {@link HexRiverCrossingEntity}
	 */
	HexRiverCrossingEntity findByToAndFrom(long from, long to);
}
