package br.com.simple_transaction.infrastructure.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "transaction")
@Table
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal value;
	
	@JoinColumn(name = "receiver_id")
	@ManyToOne
	private User receiver;
	
	@JoinColumn(name = "payer_id")
	@ManyToOne
	private User payer;
	private LocalDateTime transactionDateHour;
	
	@PrePersist
	void prePersist() {
		transactionDateHour = LocalDateTime.now();
	}
	
	
}
