package com.osrapi.controllers.dwarfstar.barbarianprince;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osrapi.models.dwarfstar.barbarianprince.EventOptionRuleEntity;
import com.osrapi.repositories.dwarfstar.barbarianprince.EventOptionRuleRepository;

/**
 * @author drau
 */
@RestController
public final class EventOptionRuleController {
	/** the data repository. */
	@Autowired
	private EventOptionRuleRepository repository;
	/**
	 * Gets a list of {@link EventOptionRuleEntity}s.
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_option_rules", method = RequestMethod.GET)
	public Object getAll() {
		Iterable<EventOptionRuleEntity> iter = repository.findAll();
		ArrayList<EventOptionRuleEntity> list =
				new ArrayList<EventOptionRuleEntity>();
		Iterator<EventOptionRuleEntity> iterator = iter.iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}
	/**
	 * Gets a single {@link EventOptionRuleEntity}.
	 * @param id the event type's id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_option_rules/{id}",
			method = RequestMethod.GET)
	public Object getById(@PathVariable final Long id) {
		return repository.findOne(id);
	}
	/**
	 * Retrieves a list of options for an event.
	 * @param eventId the event id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_option_rules/options_by_event",
			method = RequestMethod.GET)
	public Object getEventOptionByEventId(
			@RequestParam(value = "event_id") final long eventId) {
		Object o = repository.findEventOptionsForEventId(eventId);
		return o;
	}
	/**
	 * Retrieves a list of rule results for a specific event and option.
	 * @param eventId the event id
	 * @param optionId the option id
	 * @return {@link Object}
	 */
	@RequestMapping(path = "/event_option_rules/rules_by_event_option",
			method = RequestMethod.GET)
	public Object getEventRuleByEventIdAndOptionId(
			@RequestParam(value = "event_id") final Long eventId,
			@RequestParam(value = "option_id") final Long optionId) {
		System.out.println("event_id::"+eventId+"\noption_id::"+optionId);
		Object o = repository.findEventRulesForEventIdAndOptionId(
				eventId, optionId);
		return o;
	}
}
