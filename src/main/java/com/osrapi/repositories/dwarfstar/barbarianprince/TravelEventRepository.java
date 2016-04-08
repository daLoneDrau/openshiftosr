package com.osrapi.repositories.dwarfstar.barbarianprince;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.TravelEventEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface TravelEventRepository 
extends CrudRepository<TravelEventEntity, Long> {
	/**
	 * Retrieves a travel event by terrain name 2 rolls.
	 * @param terrainName the terrain name
	 * @param roll1 the first roll
	 * @param roll2 the second roll
	 * @return {@link TravelEventRepository}
	 */
	TravelEventEntity findByTerrainNameAndRoll1AndRoll2(String terrainName,
			Long roll1, Long roll2);

}
