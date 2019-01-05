package bms.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bms.User;

@Repository 
public interface UserRespository extends CrudRepository<User, Integer> {

}
