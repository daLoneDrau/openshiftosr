package com.osrapi.models.dwarfstar.barbarianprince;

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

/**
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "travel_event", schema = "dwarfstar_barbarian_prince")
public final class TravelEventEntity {
	/** the event. */
	@OneToOne(cascade = CascadeType.ALL, targetEntity = EventEntity.class,
			fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "event_id",
	referencedColumnName = "event_id")
    private EventEntity event;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "travel_event_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** roll 1. */
	@Column(name = "roll_1")
	@NotNull
	private Long roll1;
	/** roll 2. */
	@Column(name = "roll_2")
	@NotNull
	private Long roll2;
	/** the terrain. */
	@Column(name = "terrain_name")
	@NotNull
	private String terrainName;
	/** Creates a new instance of {@link TravelEventEntity}. */
	public TravelEventEntity() {
		super();
	}
	/**
	 * Gets the {@link EventEntity} associated with this travel event.
	 * @return {@link EventEntity}
	 */
    public EventEntity getEvent() {  
        return event;
    }
	/**
	 * Gets the id.
	 * @return {@link long}
	 */
	public long getId() {
		return id;
	}
	/**
	 * Gets the value of roll 1.
	 * @return {@link Long}
	 */
	public Long getRoll1() {
		return roll1;
	}
	/**
	 * Gets the value of roll 2.
	 * @return {@link Long}
	 */
	public Long getRoll2() {
		return roll2;
	}
	/**
	 * Gets the name of the terrain.
	 * @return {@link String}
	 */
	public String getTerrainName() {
		return terrainName;
	}
	/**
	 * Sets the event associated with this {@link TravelEvent}.
	 * @param e the event to set
	 */
	public void setEvent(final EventEntity e) {
		event = e;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setId(final long val) {
		id = val;
	}
	/**
	 * Sets the value of roll 1.
	 * @param val the value to set
	 */
	public void setRoll1(final Long val) {
		roll2 = val;
	}
	/**
	 * Sets the value of roll 2.
	 * @param val the value to set
	 */
	public void setRoll2(final Long val) {
		roll2 = val;
	}
	/**
	 * Sets the name of the terrain.
	 * @param val the value to set
	 */
	public void setTerrainName(final String val) {
		terrainName = val;
	}
}
