package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMP")
@Getter
@NoArgsConstructor
public class employee {

	@Id
	@Column(name = "EMP_NO")
	private String EMP_NO;
	
}
