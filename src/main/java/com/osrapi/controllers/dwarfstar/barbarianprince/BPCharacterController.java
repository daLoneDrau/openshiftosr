package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.BPCharacterEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.BPCharacterRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class BPCharacterController {
	/** the data repository. */
	@Autowired
	private BPCharacterRepository repository;
	/**
	 * Gets a list of {@link BPCharacterEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/characters",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<BPCharacterEntity> iter = repository.findAll();
		ArrayList<BPCharacterEntity> list = new ArrayList<BPCharacterEntity>();
		Iterator<BPCharacterEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link BPCharacterEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/characters/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
	/**
	 * Gets a list of {@link BPCharacterEntity}s that share a name.
	 * @param name the character's name
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/barbarian_prince/characters/name/{name}",
			method = RequestMethod.GET)
	public Object getByName(@PathVariable final String name) {
		return repository.findByName(name);
	}
}