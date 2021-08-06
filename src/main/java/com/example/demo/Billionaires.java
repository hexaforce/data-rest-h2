package com.example.demo;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Billionaires extends BaseEntity {
	private String firstName;
	private String lastName;
	private String career;
	private String content;
	private String links;
}
