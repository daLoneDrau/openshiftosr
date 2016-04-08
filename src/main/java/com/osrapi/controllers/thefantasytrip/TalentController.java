package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.TalentEntity;
import com.osrapi.repositories.thefantasytrip.TalentRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class TalentController {
	/** the data repository. */
	@Autowired
	private TalentRepository repository;
	/**
	 * Gets a list of {@link TalentEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/talents",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<TalentEntity> iter = repository.findAll();
		ArrayList<TalentEntity> list =
				new ArrayList<TalentEntity>();
		Iterator<TalentEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link TalentEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/talents/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}