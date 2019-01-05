package bms;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bms.respository.UserRespository;

@Service
@Transactional 
public class UserServices {
	
	@Autowired
	private final UserRespository userRespository;
	
	public UserServices(UserRespository userRespository) {
		this.userRespository=userRespository;
	}
	
	public void saveMyUser(User user) {
		System.out.println("data"+user.toString());
		userRespository.save(user);
	}
}
