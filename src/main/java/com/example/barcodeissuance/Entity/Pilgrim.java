	package com.example.barcodeissuance.Entity;

	import java.time.LocalDateTime;
	import java.util.UUID;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import lombok.*;
	import org.hibernate.annotations.CreationTimestamp;

	@Entity
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Getter
	@Setter
	public class Pilgrim {

		@Id
		private UUID uuid;
		private String name;
		private String gender;
		private Long adhaarNo;
		private Integer age;
		@CreationTimestamp
		private LocalDateTime createdDate;



	}
