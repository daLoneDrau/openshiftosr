package com.osrapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.osrapi.models.HexLocationEntity;

/**
 * 
 * @author drau
 *
 */
@Repository
public interface HexLocationRepository 
extends CrudRepository<HexLocationEntity, Long> {

}
