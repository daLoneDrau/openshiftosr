package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.SpellTypeEntity;
import com.osrapi.repositories.thefantasytrip.SpellTypeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class SpellTypeController {
	/** the data repository. */
	@Autowired
	private SpellTypeRepository repository;
	/**
	 * Gets a list of {@link SpellTypeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/spell_types",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<SpellTypeEntity> iter = repository.findAll();
		ArrayList<SpellTypeEntity> list =
				new ArrayList<SpellTypeEntity>();
		Iterator<SpellTypeEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link SpellTypeEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/spell_types/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}