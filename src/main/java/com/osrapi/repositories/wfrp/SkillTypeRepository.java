package com.osrapi.repositories.wfrp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.wfrp.WFRPSkillTypeEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface SkillTypeRepository 
extends CrudRepository<WFRPSkillTypeEntity, Long> {

}
