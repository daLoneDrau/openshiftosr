package com.osrapi.models.dwarfstar.barbarianprince;

import java.util.List;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author drau
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "roll", schema = "dwarfstar_barbarian_prince")
public final class RollEntity {
	/** the list of rolls for this condition. */
	@OneToMany(targetEntity = ConditionEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "roll_condition_modifier_lookup",
	schema = "dwarfstar_barbarian_prince",
	joinColumns = @JoinColumn(name = "roll_id",
	referencedColumnName = "roll_id"),
	inverseJoinColumns = @JoinColumn(name = "condition_id",
	referencedColumnName = "condition_id"))
	private List<ConditionEntity> conditions;
	/** the number of condition modifier. */
	@Column(name = "condition_modifier")
	@JsonProperty("condition_modifier")
	private long conditionModifier;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "roll_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the number of d6 rolled. */
	@Column(name = "num_d6")
	@JsonProperty("num_d6")
	private long numd6;
	/** the number of d6 rolled. */
	@Column(name = "roll_min")
	@JsonProperty("roll_min")
	private long rollMin;
	/** the number of roll modifier. */
	@Column(name = "roll_modifier")
	@JsonProperty("roll_modifier")
	private long rollModifier;

	// Public methods
	/** Creates a new instance of {@link RollEntity}. */
	public RollEntity() {
		super();
	}
	/**
	 * Gets the condition modifier.
	 * @return {@link long}
	 */
	public long getConditionModifier() {
		return conditionModifier;
	}
	/**
	 * Gets the list of conditions.
	 * @return {@link List}<{@link ConditionEntity}>
	 */
	public List<ConditionEntity> getConditions() {
		return conditions;
	}
	/**
	 * Gets the id.
	 * @return {@link long}
	 */
	public long getId() {
		return id;
	}
	/**
	 * Gets the number of d6 rolled.
	 * @return {@link long}
	 */
	public long getNumd6() {
		return numd6;
	}
	/**
	 * Gets the roll minimum.
	 * @return {@link long}
	 */
	public long getRollMin() {
		return rollMin;
	}
	/**
	 * Gets the roll modifier.
	 * @return {@link long}
	 */
	public long getRollModifier() {
		return rollModifier;
	}
	/**
	 * Sets the condition modifier.
	 * @param val the new value
	 */
	public void setConditionModifier(final long val) {
		conditionModifier = val;
	}
	/**
	 * Sets the list of conditions.
	 * @param list the new value
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
	 * Sets number of d6 rolled.
	 * @param val the new value
	 */
	public void setNumd6(final long val) {
		numd6 = val;
	}
	/**
	 * Sets the roll minimum.
	 * @param val the new value
	 */
	public void setRollMin(final long val) {
		rollMin = val;
	}
	/**
	 * Sets the roll modifier.
	 * @param val the new value
	 */
	public void setRollModifier(final long val) {
		rollModifier = val;
	}
}