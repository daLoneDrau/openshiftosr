package com.osrapi.models.dwarfstar.barbarianprince;

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
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "bp_character", schema = "dwarfstar_barbarian_prince")
public final class BPCharacterEntity {
	/** the combat skill. */
	@NotNull
	@Column(name = "combat_skill")
	@JsonProperty("combat_skill")
	private long combatSkill;
	/** the endurance. */
	@NotNull
	private long endurance;
	/** the list of groups the IO is in. */
	@OneToMany(targetEntity = IOGroupEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "bp_character_io_group_lookup",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "bp_character_id",
	referencedColumnName = "bp_character_id"),
	inverseJoinColumns = @JoinColumn(name = "io_group_id",
	referencedColumnName = "io_group_id"))
	@JsonProperty("group")
	private List<IOGroupEntity> groups;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "bp_character_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the name of the location. */
	private String name;
	/** the wealth code. */
	@NotNull
	private String wealth;
	/** the wit and wiles. */
	@Column(name = "wit_wiles")
	private Long wit;
	/** Creates a new instance of {@link BPCharacterEntity}. */
	public BPCharacterEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link BPCharacterEntity}.
	 * @param i the new id
	 * @param n the name
	 * @param cs the combat skill
	 * @param e the endurance
	 * @param we the wealth code
	 * @param wi the wit
	 */
	public BPCharacterEntity(final long i, final String n, final long cs, 
			final long e, final String we, final Long wi) {
		id = i;
		name = n;
		combatSkill = cs;
		endurance = e;
		wealth = we;
		wit = wi;
	}
	/**
	 * Gets the combat skill.
	 * @return {@link long}
	 */
	public long getCombatSkill() {
		return combatSkill;
	}
	/**
	 * Gets the endurance.
	 * @return {@link long}
	 */
	public long getEndurance() {
		return endurance;
	}
	/**
	 * Gets the list of groups the IO is in.
	 * @return {@link List}<{@link IOGroupEntity}>
	 */
	public List<IOGroupEntity> getGroups() {
		return groups;
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
	 * Gets the wealth code.
	 * @return {@link String}
	 */
	public String getWealth() {
		return wealth;
	}
	/**
	 * Gets the type.
	 * @return {@link long}
	 */
	public Long getWit() {
		return wit;
	}
	/**
	 * Sets the combat skill.
	 * @param val the new value
	 */
	public void setCombatSkill(final long val) {
		combatSkill = val;
	}
	/**
	 * Sets the endurance.
	 * @param val the new value
	 */
	public void setEndurance(final long val) {
		endurance = val;
	}
	/**
	 * Sets the list of groups the IO is in.
	 * @param list the list to set
	 */
	public void setGroups(final List<IOGroupEntity> list) {
		groups = list;
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
	 * Sets the wealth code.
	 * @param val the new value
	 */
	public void setWealth(final String val) {
		wealth = val;
	}
	/**
	 * Sets the wit.
	 * @param val the new value
	 */
	public void setWit(final Long val) {
		wit = val;
	}
}
