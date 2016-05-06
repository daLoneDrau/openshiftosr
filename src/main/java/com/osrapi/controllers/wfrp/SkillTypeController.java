package com.osrapi.controllers.wfrp;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.wfrp.WFRPSkillTypeEntity;
import com.osrapi.repositories.wfrp.SkillTypeRepository;

/**
 * 
 * @author drau
 *
 */
@RestController
public final class SkillTypeController {
	/** the data repository. */
	@Autowired
	private SkillTypeRepository repository;
	/**
	 * Gets a list of {@link WFRPSkillTypeEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/wfrp/skill_types",
			method = RequestMethod.GET)
	public Object getAll() {
		Iterable<WFRPSkillTypeEntity> iter = repository.findAll();
		ArrayList<WFRPSkillTypeEntity> list =
				new ArrayList<WFRPSkillTypeEntity>();
		Iterator<WFRPSkillTypeEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link WFRPSkillTypeEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/wfrp/skill_types/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
}