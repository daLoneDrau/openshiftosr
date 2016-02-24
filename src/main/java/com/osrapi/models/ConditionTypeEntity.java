package com.osrapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "condition_type", schema = "dwarfstar_barbarian_prince")
public final class ConditionTypeEntity {
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "condition_type_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the name of the event type. */
	@NotNull
	private String name;
	/** Creates a new instance of {@link ConditionTypeEntity}. */
	public ConditionTypeEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link ConditionTypeEntity}.
	 * @param n the name
	 */
	public ConditionTypeEntity(final String n) {
		name = n;
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
}
