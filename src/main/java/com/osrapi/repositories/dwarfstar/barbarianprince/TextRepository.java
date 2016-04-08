package com.osrapi.repositories.dwarfstar.barbarianprince;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.dwarfstar.barbarianprince.TextEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface TextRepository 
extends CrudRepository<TextEntity, Long> {
	/**
	 * Retrieves a list of text by their section.
	 * @param section the section
	 * @return {@link List}<{@link BPCharacterEntity}>
	 */
	List<TextEntity> findBySection(String section);
}
