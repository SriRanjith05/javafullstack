package com.newtonapple.cards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cards {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cardId;
	private String mobileNumber;
	private String cardNumber;
	private String cardType;
	private int totalLimit;
	private String amountUsed;
	private String availableAmount;

}
