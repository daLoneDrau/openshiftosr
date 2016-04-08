package com.osrapi.repositories.dwarfstar.barbarianprince;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.BPCharacterEntity;
import com.osrapi.models.dwarfstar.barbarianprince.TreasureTableEntity;

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
