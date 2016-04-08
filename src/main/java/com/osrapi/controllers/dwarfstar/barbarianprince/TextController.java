package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.TextEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.TextRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class TextController {
	/** the data repository. */
	@Autowired
	private TextRepository repository;
	/**
	 * Gets a list of {@link TextEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/text",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<TextEntity> iter = repository.findAll();
		ArrayList<TextEntity> list = new ArrayList<TextEntity>();
		Iterator<TextEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a list of {@link TextEntity}s that share a section name.
	 * @param section the text section
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/text/section/{section}",
			method = RequestMethod.GET)
	public Object getByName(@PathVariable final String section) {
		return repository.findBySection(section);
	}
}