package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.controllers.entities.TreasureRoll;
import com.osrapi.models.dwarfstar.barbarianprince.TreasureTableEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.TreasureTableRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class TreasureTableController {
	/** the data repository. */
	@Autowired
	private TreasureTableRepository repository;
	/**
	 * Gets a list of {@link TreasureTableEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/treasure_table",
			method = RequestMethod.GET)
	public Object getEvents() {
		Iterable<TreasureTableEntity> iter = repository.findAll();
		ArrayList<TreasureTableEntity> list = 
				new ArrayList<TreasureTableEntity>();
		Iterator<TreasureTableEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link TreasureTableEntity}.
	 * @param wealth the wealth code
	 * @param roll the die roll
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/treasure_table/by_roll",
			method = RequestMethod.GET)
	public Object getEvent(@RequestParam(value = "wealth") final String wealth,
			@RequestParam(value = "roll") final long roll) {
		return repository.findByWealthAndRoll(wealth, roll);
	}
}