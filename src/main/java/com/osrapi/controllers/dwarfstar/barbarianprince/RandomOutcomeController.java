package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.RandomOutcomeEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.RandomOutcomeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class RandomOutcomeController {
	/** the data repository. */
	@Autowired
	private RandomOutcomeRepository repository;
	/**
	 * Gets a list of {@link RandomOutcomeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_rolls", method = RequestMethod.GET)
	public Object getEvents() {
		Iterable<RandomOutcomeEntity> iter = repository.findAll();
		ArrayList<RandomOutcomeEntity> list = 
				new ArrayList<RandomOutcomeEntity>();
		Iterator<RandomOutcomeEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link EventTypeEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_rolls/{id}", method = RequestMethod.GET)
	public Object getEvent(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}