package com.osrapi.repositories.thefantasytrip;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.thefantasytrip.TalentEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface TalentRepository 
extends CrudRepository<TalentEntity, Long> {

}
