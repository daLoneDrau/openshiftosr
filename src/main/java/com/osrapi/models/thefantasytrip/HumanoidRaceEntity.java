package com.osrapi.models.thefantasytrip;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author drau
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "humanoid_race", schema = "the_fantasy_trip")
public final class HumanoidRaceEntity {
	/** the description. */
	@NotNull
	private String	description;
	/** the full name. */
	@NotNull
	@Column(name = "full_name")
	@JsonProperty("full_name")
	private String	fullName;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "humanoid_race_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long	id;
	/** the short name. */
	@NotNull
	@Column(name = "short_name")
	@JsonProperty("short_name")
	private String	shortName;
	/** the starting dexterity. */
	@Column(name = "starting_dx")
	@JsonProperty("starting_dx")
	private long	startingDx;
	/** the starting EP. */
	@Column(name = "starting_ep")
	@JsonProperty("starting_ep")
	private long	startingEp;
	/** the starting IQ. */
	@Column(name = "starting_iq")
	@JsonProperty("starting_iq")
	private long	startingIq;
	/** the starting strength. */
	@Column(name = "starting_st")
	@JsonProperty("starting_st")
	private long	startingSt;
	/** Creates a new instance of {@link HumanoidRaceEntity}. */
	public HumanoidRaceEntity() {
		super();
	}
	/**
	 * Gets the description.
	 * @return {@link String}
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Gets the name.
	 * @return {@link String}
	 */
	public String getFullName() {
		return fullName;
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
	public String getShortName() {
		return shortName;
	}
	/**
	 * Gets the starting dexterity.
	 * @return {@link long}
	 */
	public long getStartingDx() {
		return startingDx;
	}
	/**
	 * Gets the starting EP.
	 * @return {@link long}
	 */
	public long getStartingEp() {
		return startingEp;
	}
	/**
	 * Gets the starting IQ.
	 * @return {@link long}
	 */
	public long getStartingIq() {
		return startingIq;
	}
	/**
	 * Gets the starting strength.
	 * @return {@link long}
	 */
	public long getStartingSt() {
		return startingSt;
	}
	/**
	 * Sets the description.
	 * @param val the new value
	 */
	public void setDescription(final String val) {
		description = val;
	}
	/**
	 * Sets the full name.
	 * @param val the new value
	 */
	public void setFullName(final String val) {
		fullName = val;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setId(final long val) {
		id = val;
	}
	/**
	 * Sets the short name.
	 * @param val the new value
	 */
	public void setShortName(final String val) {
		shortName = val;
	}
	/**
	 * Sets the starting dexterity.
	 * @param val the value to set
	 */
	public void setStartingDx(final long val) {
		startingDx = val;
	}
	/**
	 * Sets the starting EP.
	 * @param val the value to set
	 */
	public void setStartingEpx(final long val) {
		startingEp = val;
	}
	/**
	 * Sets the starting IQ.
	 * @param val the value to set
	 */
	public void setStartingIq(final long val) {
		startingIq = val;
	}
	/**
	 * Sets the starting strength.
	 * @param val the value to set
	 */
	public void setStartingSt(final long val) {
		startingSt = val;
	}
}
