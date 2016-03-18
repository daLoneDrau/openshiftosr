package com.osrapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.osrapi.models.EventOptionRuleEntity;

/**
 * @author drau
 */
@Repository
public interface EventOptionRuleRepository
		extends CrudRepository<EventOptionRuleEntity, Long> {
	/**
	 * Retrieves a list of options for an event.
	 * @param eventId the event id
	 * @return {@link EventOptionRuleEntity}
	 */
	@Query("select distinct option from EventOptionRuleEntity e "
			+ "where e.eventId = :eventId")
	List<EventOptionRuleEntity> findEventOptionsForEventId(
			@Param("eventId") Long eventId);
	/**
	 * Retrieves a list of rule results for a specific event and option.
	 * @param eventId the event id
	 * @param optionId the event option id
	 * @return {@link EventOptionRuleEntity}
	 */
	@Query("select rule from EventOptionRuleEntity e "
			+ "where e.eventId = :eventId and e.option.id = :optionId")
	List<EventOptionRuleEntity> findEventRulesForEventIdAndOptionId(
			@Param("eventId") Long eventId,
			@Param("optionId") Long optionId);
}
