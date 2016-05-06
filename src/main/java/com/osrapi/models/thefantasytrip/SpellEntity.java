package com.osrapi.models.thefantasytrip;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "spell", schema = "the_fantasy_trip")
public final class SpellEntity {
	/** the description. */
	@NotNull
	private String			description;
	/** the spell duration. */
	@Column(name = "spell_duration")
	@JsonProperty("spell_duration")
	private Long			duration;
	/** the full name. */
	@NotNull
	@Column(name = "full_name")
	@JsonProperty("full_name")
	private String			fullName;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "spell_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long			id;
	/** the IQ level. */
	@Column(name = "iq_level")
	@JsonProperty("iq_level")
	private Long			iqLevel;
	/** the maintenance cost. */
	@Column(name = "maintenance_cost")
	@JsonProperty("maintenance_cost")
	private Long			maintenance;
	/** the short name. */
	@NotNull
	@Column(name = "short_name")
	@JsonProperty("short_name")
	private String			shortName;
	/** the strength cost. */
	@Column(name = "st_cost")
	@JsonProperty("st_cost")
	private Long			stCost;
	/** the archetype's character type. */
	@OneToOne(cascade = CascadeType.ALL, targetEntity = TFTSkillTypeEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "spell_type_id", referencedColumnName = "spell_type_id")
	private TFTSkillTypeEntity	type;
	// Public methods
	/** Creates a new instance of {@link SpellEntity}. */
	public SpellEntity() {
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
	 * Gets the duration.
	 * @return {@link Long}
	 */
	public Long getDuration() {
		return duration;
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
	 * Gets the IQ level.
	 * @return {@link Long}
	 */
	public Long getIqLevel() {
		return iqLevel;
	}
	/**
	 * Gets the maintenance cost.
	 * @return {@link Long}
	 */
	public Long getMaintenance() {
		return maintenance;
	}
	/**
	 * Gets the name.
	 * @return {@link String}
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * Gets the strength cost.
	 * @return {@link Long}
	 */
	public Long getStCost() {
		return stCost;
	}
	/**
	 * Gets the type.
	 * @return {@link TFTSkillTypeEntity}
	 */
	public TFTSkillTypeEntity getType() {
		return type;
	}
	/**
	 * Sets the description.
	 * @param val the new value
	 */
	public void setDescription(final String val) {
		description = val;
	}
	/**
	 * Sets the duration.
	 * @param val the value to set
	 */
	public void setDuration(final long val) {
		duration = val;
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
	 * Sets the IQ level.
	 * @param val the value to set
	 */
	public void setIqLevel(final long val) {
		iqLevel = val;
	}
	/**
	 * Sets the maintenance cost.
	 * @param val the value to set
	 */
	public void setMaintenance(final long val) {
		maintenance = val;
	}
	/**
	 * Sets the short name.
	 * @param val the new value
	 */
	public void setShortName(final String val) {
		shortName = val;
	}
	/**
	 * Sets the strength cost.
	 * @param val the value to set
	 */
	public void setStCost(final long val) {
		stCost = val;
	}
	/**
	 * Sets the type.
	 * @param val the new value
	 */
	public void setType(final TFTSkillTypeEntity val) {
		type = val;
	}
}
