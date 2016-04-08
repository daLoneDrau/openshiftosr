package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.EventTypeEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.EventTypeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class EventTypeController {
	/** the data repository. */
	@Autowired
	private EventTypeRepository repository;
	/**
	 * Gets a list of {@link EventTypeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_types", method = RequestMethod.GET)
	public Object getAll() {
		Iterable<EventTypeEntity> iter = repository.findAll();
		ArrayList<EventTypeEntity> list = new ArrayList<EventTypeEntity>();
		Iterator<EventTypeEntity> iterator = iter.iterator();
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
	@RequestMapping(path = "/event_types/{id}", method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}