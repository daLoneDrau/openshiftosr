package com.osrapi.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.ConditionEntity;
import com.osrapi.repositories.ConditionRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class ConditionController {
	/** the data repository. */
	@Autowired
	private ConditionRepository repository;
	/**
	 * Gets a list of {@link ConditionEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/conditions", method = RequestMethod.GET)
	public Object getConditions() {
		Iterable<ConditionEntity> iter = repository.findAll();
		ArrayList<ConditionEntity> list = new ArrayList<ConditionEntity>();
		Iterator<ConditionEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link ConditionEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/conditions/{id}", method = RequestMethod.GET)
	public Object getCondition(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}