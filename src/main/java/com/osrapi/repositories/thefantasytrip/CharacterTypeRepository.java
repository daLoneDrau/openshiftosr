package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.CharacterTypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface CharacterTypeRepository 
extends CrudRepository<CharacterTypeEntity, Long> {

}
