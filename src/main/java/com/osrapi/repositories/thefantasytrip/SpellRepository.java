package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.SpellEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface SpellRepository 
extends CrudRepository<SpellEntity, Long> {

}
