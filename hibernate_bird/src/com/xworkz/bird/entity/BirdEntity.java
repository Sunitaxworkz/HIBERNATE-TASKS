package com.xworkz.bird.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird_table")
public class BirdEntity {
	@Id
	@Column(name = "i_id")
	private int id;
	@Column(name = "i_Name")
	private String name;
	@Column(name = "i_LifeSpan")
	private int lifeSpan;
	@Column(name = "i_Color")
	private String color;
	@Column(name = "i_ScientificName")
	private String scientificName;
	@Column(name = "i_Teeth")
	private boolean teeth;
	@Column(name = "i_NationalBird")
	private boolean nationalBird;
	@Column(name = "i_Family")
	private String family;
	@Column(name = "i_Migrate")
	private boolean migrate;
	@Column(name = "i_Famous")
	private boolean famous;

	public BirdEntity() {
		// TODO Auto-generated constructor stub
	}

	public BirdEntity(int id, String name, int lifeSpan, String color, String scientificName, boolean teeth,
			boolean nationalBird, String family, boolean migrate, boolean famous) {
		super();
		this.id = id;
		this.name = name;
		this.lifeSpan = lifeSpan;
		this.color = color;
		this.scientificName = scientificName;
		this.teeth = teeth;
		this.nationalBird = nationalBird;
		this.family = family;
		this.migrate = migrate;
		this.famous = famous;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", lifeSpan=" + lifeSpan + ", color=" + color
				+ ", scientificName=" + scientificName + ", teeth=" + teeth + ", nationalBird=" + nationalBird
				+ ", family=" + family + ", migrate=" + migrate + ", famous=" + famous + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirdEntity other = (BirdEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public boolean isTeeth() {
		return teeth;
	}

	public void setTeeth(boolean teeth) {
		this.teeth = teeth;
	}

	public boolean isNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(boolean nationalBird) {
		this.nationalBird = nationalBird;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public boolean isMigrate() {
		return migrate;
	}

	public void setMigrate(boolean migrate) {
		this.migrate = migrate;
	}

	public boolean isFamous() {
		return famous;
	}

	public void setFamous(boolean famous) {
		this.famous = famous;
	}

}
