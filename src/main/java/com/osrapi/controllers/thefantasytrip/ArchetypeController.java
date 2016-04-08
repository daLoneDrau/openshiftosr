package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.ArchetypeEntity;
import com.osrapi.repositories.thefantasytrip.ArchetypeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class ArchetypeController {
	/** the data repository. */
	@Autowired
	private ArchetypeRepository repository;
	/**
	 * Gets a list of {@link ArchetypeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/archetypes",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<ArchetypeEntity> iter = repository.findAll();
		ArrayList<ArchetypeEntity> list = new ArrayList<ArchetypeEntity>();
		Iterator<ArchetypeEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link ArchetypeEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/archetypes/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}