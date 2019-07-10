package com.haris.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="city2")
public class City {

	@Id
	private int id;
	private String Name;
	private String Code;
	private String District;
	private int Population;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", Name=" + Name + ", Code=" + Code + ", District=" + District + ", Population="
				+ Population + "]";
	}
	
	
	
	
}
