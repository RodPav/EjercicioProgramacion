package com.people.EjercicioProgramacion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author rodrigo
 *
 */
@Data
@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name= "rut")
	private String rut;

	@Column(name= "name")
	private String name;

	@Column(name= "last_name")
	private String lastName;

	@Column(name= "age")
	private int age;

	@Column(name= "course")
	private int course;
}