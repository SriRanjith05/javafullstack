package com.newtonapple.cards.serviceimpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.newtonapple.cards.dto.CardsDto;
import com.newtonapple.cards.entity.Cards;
import com.newtonapple.cards.exception.CardAlreadyExistsException;
import com.newtonapple.cards.repository.CardsRepository;
import com.newtonapple.cards.service.ICardsService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class CardsServiceImpl implements ICardsService{
	
	private CardsRepository cardsRepository;
	
	@Override
	public void createCard(CardsDto cardsDto) {
		Optional<Cards> optional = cardsRepository.findByMobileNumber(cardsDto.getMobileNumber());
		if(optional.isPresent()) {
			throw new CardAlreadyExistsException("Already Card available for Customer with given mobile number");
		}
		
		//converting CardsDto to Cards Entity
		Cards cards = new Cards();
		BeanUtils.copyProperties(cardsDto, cards);
		cardsRepository.save(cards);
	}
	
	
	public CardsDto fetchCard(String mobileNumber) {
		return null;
	}
	
	public boolean updateCard(CardsDto cardsDto) {
		return false;
	}
	
	public boolean deleteCard(String mobileNumber) {
		return false;
	}

}
