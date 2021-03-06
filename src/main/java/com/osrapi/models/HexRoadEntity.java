package com.osrapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "hex_road", schema = "dwarfstar_barbarian_prince")
public final class HexRoadEntity {
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "hex_road_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the location the road comes from. */
	@Column(name = "hex_road_from")
	private long from;
	/** the location the road comes from. */
	@Column(name = "hex_road_to")
	private long to;
	/** Creates a new instance of {@link HexRoadEntity}. */
	public HexRoadEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link HexRoadEntity}.
	 * @param i the id
	 * @param t the type
	 * @param n the name
	 * @param x1 the x-coordinates
	 * @param y1 the y-coordinates
	 * @param l the location stored in bit format
	 */
	public HexRoadEntity(long i, long f, long t) {
		id = i;
		from = f;
		to = t;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(long f) {
		this.from = f;
	}
	public long getFrom() {
		return from;
	}
	public long getTo() {
		return to;
	}
}
