package com.osrapi.controllers.wfrp;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.wfrp.WFRPRaceEntity;
import com.osrapi.repositories.wfrp.RaceRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class RaceController {
	/** the data repository. */
	@Autowired
	private RaceRepository repository;
	/**
	 * Gets a list of {@link WFRPRaceEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/wfrp/races",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<WFRPRaceEntity> iter = repository.findAll();
		ArrayList<WFRPRaceEntity> list =
				new ArrayList<WFRPRaceEntity>();
		Iterator<WFRPRaceEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link WFRPRaceEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/wfrp/races/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}