package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.SpellEntity;
import com.osrapi.repositories.thefantasytrip.SpellRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class SpellController {
	/** the data repository. */
	@Autowired
	private SpellRepository repository;
	/**
	 * Gets a list of {@link SpellEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/spells",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<SpellEntity> iter = repository.findAll();
		ArrayList<SpellEntity> list =
				new ArrayList<SpellEntity>();
		Iterator<SpellEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link SpellEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/spells/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}