package com.osrapi.controllers.thefantasytrip;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.thefantasytrip.HumanoidRaceEntity;
import com.osrapi.repositories.thefantasytrip.HumanoidRaceRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class HumanoidRaceController {
	/** the data repository. */
	@Autowired
	private HumanoidRaceRepository repository;
	/**
	 * Gets a list of {@link HumanoidRaceEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/humanoid_races",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<HumanoidRaceEntity> iter = repository.findAll();
		ArrayList<HumanoidRaceEntity> list =
				new ArrayList<HumanoidRaceEntity>();
		Iterator<HumanoidRaceEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link HumanoidRaceEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/the_fantasy_trip/humanoid_races/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}