package com.osrapi.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author drau
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "programmed_event", schema = "dwarfstar_barbarian_prince")
public final class SubEventEntity {
	/** the list of characters spawned by this event. */
	@OneToMany(targetEntity = BPCharacterEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "programmed_event_character_spawn_lookup",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "programmed_event_id",
	referencedColumnName = "programmed_event_id"),
	inverseJoinColumns = @JoinColumn(name = "bp_character_id",
	referencedColumnName = "bp_character_id"))
	private List<BPCharacterEntity> characters;
	/** the list of conditions to this event. */
	@OneToMany(targetEntity = ConditionEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "programmed_event_condition_lookup",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "programmed_event_id",
	referencedColumnName = "programmed_event_id"),
	inverseJoinColumns = @JoinColumn(name = "condition_id",
	referencedColumnName = "condition_id"))
	private List<ConditionEntity> conditions;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "programmed_event_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the sub event name. */
	@NotNull
	private String name;
	/** the list of random outcomes to this event. */
	@OneToMany(targetEntity = RandomOutcomeEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "programmed_event_random_event_outcome",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "programmed_event_id",
	referencedColumnName = "programmed_event_id"),
	inverseJoinColumns = @JoinColumn(name = "random_event_outcome_id",
	referencedColumnName = "random_event_outcome_id"))
	private List<RandomOutcomeEntity> outcomes;
	/** the list of turn phases to this event. */
	@OneToMany(targetEntity = TurnPhaseEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "programmed_event_turn_phase_lookup",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "programmed_event_id",
	referencedColumnName = "programmed_event_id"),
	inverseJoinColumns = @JoinColumn(name = "turn_phase_id",
	referencedColumnName = "turn_phase_id"))
	@JsonProperty("turn_phase")
	private List<TurnPhaseEntity> turnPhases;
	/** the sub event type. */
	@Column(name = "event_type_id", nullable = false)
	private long type;

	// Public methods
	/** Creates a new instance of {@link SubEventEntity}. */
	public SubEventEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link SubEventEntity}.
	 * @param n the name
	 * @param t the type
	 */
	public SubEventEntity(final String n, final long t) {
		name = n;
		type = t;
	}
	/**
	 * Gets the list of characters spawned.
	 * @return {@link List}<{@link BPCharacterEntity}>
	 */
	public List<BPCharacterEntity> getCharacters() {
		return characters;
	}
	/**
	 * Gets the list of conditions.
	 * @return {@link List}<{@link ConditionEntity}>
	 */
	public List<ConditionEntity> getConditions() {
		return conditions;
	}
	/**
	 * Gets the list of random outcomes.
	 * @return {@link List}<{@link RandomOutcomeEntity}>
	 */
	public List<RandomOutcomeEntity> getEventRolls() {
		return outcomes;
	}
	/**
	 * Gets the id.
	 * @return {@link long}
	 */
	public long getId() {
		return id;
	}
	/**
	 * Gets the name.
	 * @return {@link String}
	 */
	public String getName() {
		return name;
	}
	/**
	 * Gets the list of turn phases where the event can occur.
	 * @return {@link List}<{@link TurnPhaseEntity}>
	 */
	public List<TurnPhaseEntity> getTurnPhases() {
		return turnPhases;
	}
	/**
	 * Gets the type.
	 * @return {@link long}
	 */
	public long getType() {
		return type;
	}
	/**
	 * Sets the list of characters spawned.
	 * @param list the list to set
	 */
	public void setCharacters(final List<BPCharacterEntity> list) {
		characters = list;
	}
	/**
	 * Sets the list of conditions.
	 * @param list the list to set
	 */
	public void setConditions(final List<ConditionEntity> list) {
		conditions = list;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setId(final long val) {
		id = val;
	}
	/**
	 * Sets the name.
	 * @param val the new value
	 */
	public void setName(final String val) {
		name = val;
	}
	/**
	 * Sets the list of random outcomes.
	 * @param list the list to set
	 */
	public void setOutcomes(final List<RandomOutcomeEntity> list) {
		outcomes = list;
	}
	/**
	 * Sets the list of turn phases.
	 * @param list the list to set
	 */
	public void setTurnPhases(final List<TurnPhaseEntity> list) {
		turnPhases = list;
	}
	/**
	 * Sets the type.
	 * @param val the new value
	 */
	public void setType(final long val) {
		id = val;
	}
}
