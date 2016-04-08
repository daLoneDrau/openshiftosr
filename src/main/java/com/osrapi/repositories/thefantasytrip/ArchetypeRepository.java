package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.ArchetypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface ArchetypeRepository 
extends CrudRepository<ArchetypeEntity, Long> {

}
