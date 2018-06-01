package com.cmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmc.dto.QuestionDTO;
import com.cmc.model.User;

import com.cmc.repository.UserRepository;
import com.cmc.util.Constants;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	@Override
	public String getProfile(QuestionDTO questionDTO) {
		int amount = Constants.SAVING.get(questionDTO.getSaving()) + Constants.LOAN.get(questionDTO.getLoan());
		String profile = Constants.PROFILE.A;
		if(amount >= Constants.SCORE.SCORE_2 && amount < Constants.SCORE.SCORE_4) {
			profile = Constants.PROFILE.D;
		}
		if(amount >= Constants.SCORE.SCORE_4 && amount < Constants.SCORE.SCORE_6) {
			profile = Constants.PROFILE.C;
		}
		if(amount >= Constants.SCORE.SCORE_6 && amount < Constants.SCORE.SCORE_8) {
			profile = Constants.PROFILE.B;
		}
		userRepository.save(new User(profile ,amount));
		return profile;
	}
	
}
