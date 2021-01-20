package com.myspace.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Age")
	private int age;
	@org.kie.api.definition.type.Label("Tickets")
	private int tickets;
	@org.kie.api.definition.type.Label("Accidents")
	private int accidents;

	@org.kie.api.definition.type.Label("Vehicle")
	private java.lang.String vehicle;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAccidents() {
		return this.accidents;
	}

	public void setAccidents(int accidents) {
		this.accidents = accidents;
	}

	public int getTickets() {
		return this.tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public java.lang.String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(java.lang.String vehicle) {
		this.vehicle = vehicle;
	}

	public Applicant(java.lang.String name, int age, int tickets,
			int accidents, java.lang.String vehicle) {
		this.name = name;
		this.age = age;
		this.tickets = tickets;
		this.accidents = accidents;
		this.vehicle = vehicle;
	}

}