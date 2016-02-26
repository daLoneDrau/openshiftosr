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

/**
 * 
 * @author drau
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "hex_location", schema = "dwarfstar_barbarian_prince")
public final class HexLocationEntity {
	/** the list of features. */
    @OneToMany(targetEntity = HexFeatureEntity.class, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(name = "location_feature",
    schema = "dwarfstar_barbarian_prince", 
    joinColumns = @JoinColumn(name = "hex_location_id",
    referencedColumnName = "hex_location_id"),
    inverseJoinColumns = @JoinColumn(name = "hex_feature_id", 
    referencedColumnName = "hex_feature_id")) 
	private List<HexFeatureEntity> features;
	/**
	 * the primary key - an autogenerated id (unique for each user in the db).
	 */
	@Id
	@Column(name = "hex_location_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/** the hex type. */
	@Column(name = "hex_type_id")
	private long type;
	/** the name of the location. */
	private String name;
	/** the x-coordinates. */
	@NotNull
	private long x;
	/** the y-coordinates. */
	@NotNull
	private long y;
	/** the location stored in bit format. */
	@Column(name = "loc_conversion")
	@NotNull
	private long locationConversion;
	/** Creates a new instance of {@link HexLocationEntity}. */
	public HexLocationEntity() {
		super();
	}
	/**
	 * Creates a new instance of {@link HexLocationEntity}.
	 * @param i the id
	 * @param t the type
	 * @param n the name
	 * @param x1 the x-coordinates
	 * @param y1 the y-coordinates
	 * @param l the location stored in bit format
	 */
	public HexLocationEntity(final long i, final long t, final String n, 
			final long x1, final long y1, final long l) {
		id = i;
		type = t;
		name = n;
		x = x1;
		y = y1;
		locationConversion = l;
	}
	/**
	 * Gets the list of features.
	 * @return {@link List}<{@link HexFeatureEntity}>
	 */
	public List<HexFeatureEntity> getFeatures() {
		return features;
	}
	/**
	 * Gets the id.
	 * @return {@link long}
	 */
	public long getId() {
		return id;
	}
	/**
	 * Gets the locationConversion.
	 * @return {@link long}
	 */
	public long getLocationConversion() {
		return locationConversion;
	}
	/**
	 * Gets the type.
	 * @return {@link long}
	 */
	public long getType() {
		return type;
	}
	/**
	 * Gets the x-coordinates.
	 * @return {@link long}
	 */
	public long getX() {
		return x;
	}
	/**
	 * Gets the y-coordinates.
	 * @return {@link long}
	 */
	public long getY() {
		return y;
	}
	/**
	 * Gets the name.
	 * @return {@link String}
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the list of features.
	 * @param list the list to set
	 */
	public void setFeatures(final List<HexFeatureEntity> list) {
		features = list;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setId(final long val) {
		id = val;
	}
	/**
	 * Sets the locationConversion.
	 * @param val the new value
	 */
	public void setLocationConversion(final long val) {
		locationConversion = val;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setX(final long val) {
		x = val;
	}
	/**
	 * Sets the id.
	 * @param val the new value
	 */
	public void setY(final long val) {
		y = val;
	}
	/**
	 * Sets the type.
	 * @param val the new value
	 */
	public void setType(final long val) {
		type = val;
	}
	/**
	 * Sets the name.
	 * @param val the new value
	 */
	public void setName(final String val) {
		name = val;
	}
}