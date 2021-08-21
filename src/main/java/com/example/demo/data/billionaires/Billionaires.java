package com.example.demo.data.billionaires;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.example.demo.data.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Billionaires extends BaseEntity {
	@NotNull
	private String firstName, lastName, career, content, links;
}
