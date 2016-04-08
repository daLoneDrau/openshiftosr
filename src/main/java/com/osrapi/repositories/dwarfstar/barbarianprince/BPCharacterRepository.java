package com.osrapi.repositories.dwarfstar.barbarianprince;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.BPCharacterEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface BPCharacterRepository 
extends CrudRepository<BPCharacterEntity, Long> {
	/**
	 * Retrieves a list of characters by their name.
	 * @param name the name
	 * @return {@link List}<{@link BPCharacterEntity}>
	 */
	List<BPCharacterEntity> findByName(String name);
}
