package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.CharacterTypeEntity;
import com.osrapi.repositories.thefantasytrip.CharacterTypeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class CharacterTypeController {
	/** the data repository. */
	@Autowired
	private CharacterTypeRepository repository;
	/**
	 * Gets a list of {@link CharacterTypeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/character_types",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<CharacterTypeEntity> iter = repository.findAll();
		ArrayList<CharacterTypeEntity> list =
				new ArrayList<CharacterTypeEntity>();
		Iterator<CharacterTypeEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link CharacterTypeEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/character_types/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}