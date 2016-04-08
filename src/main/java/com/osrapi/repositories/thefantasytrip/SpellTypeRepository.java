package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.SpellTypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface SpellTypeRepository 
extends CrudRepository<SpellTypeEntity, Long> {

}
