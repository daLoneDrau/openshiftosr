package com.osrapi.models.dwarfstar.barbarianprince;

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
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "treasure_table", schema = "dwarfstar_barbarian_prince")
public final class TreasureTableEntity {
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "treasure_table_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the die roll. */
	@NotNull
	private long roll;
	/** the roll result. */
	@NotNull
	@Column(name = "roll_result")
	@JsonProperty("roll_result")
	private String rollResult;
	/** the wealth code. */
	@NotNull
	private String wealth;
	/** Creates a new instance of {@link TreasureTableEntity}. */
	public TreasureTableEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link TreasureTableEntity}.
	 * @param i the new id
	 * @param rr the roll result
	 * @param cs the combat skill
	 * @param r the die roll
	 * @param we the wealth code
	 * @param wi the wit
	 */
	public TreasureTableEntity(final long i, final String rr, final long cs, 
			final long r, final String we, final Long wi) {
		id = i;
		rollResult = rr;
		roll = r;
		wealth = we;
	}
	/**
	 * Gets the id.
	 * @return {@link long}
	 */
	public long getId() {
		return id;
	}
	/**
	 * Gets the die roll.
	 * @return {@link long}
	 */
	public long getRoll() {
		return roll;
	}
	/**
	 * Gets the roll result.
	 * @return {@link String}
	 */
	public String getRollResult() {
		return rollResult;
	}
	/**
	 * Gets the wealth code.
	 * @return {@link String}
	 */
	public String getWealth() {
		return wealth;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setId(final long val) {
		id = val;
	}
	/**
	 * Sets the die roll.
	 * @param val the new value
	 */
	public void setRoll(final long val) {
		roll = val;
	}
	/**
	 * Sets the roll result.
	 * @param val the new value
	 */
	public void setRollResult(final String val) {
		rollResult = val;
	}
	/**
	 * Sets the wealth code.
	 * @param val the new value
	 */
	public void setWealth(final String val) {
		wealth = val;
	}
}
