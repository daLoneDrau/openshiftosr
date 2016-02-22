package com.osrapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.BPCharacterEntity;
import com.osrapi.models.TreasureTableEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface TreasureTableRepository 
extends CrudRepository<TreasureTableEntity, Long> {
	/**
	 * Retrieves a roll results by their wealth code and roll.
	 * @param wealth the wealth code
	 * @param roll the roll
	 * @return {@link List}<{@link BPCharacterEntity}>
	 */
	List<BPCharacterEntity> findByWealthAndRoll(String wealth, long roll);
}
