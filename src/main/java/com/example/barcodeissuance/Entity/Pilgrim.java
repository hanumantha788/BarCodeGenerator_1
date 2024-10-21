package com.example.barcodeissuance.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pilgrim {
	
	@Id
	private String uuid;
	private String name;
	private String gender;
	private Long adhaarNo;
	private Integer age;
	private Date createdDate;
	

}
