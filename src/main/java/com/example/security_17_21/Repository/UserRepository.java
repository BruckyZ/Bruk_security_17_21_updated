package com.example.security_17_21.Repository;

import com.example.security_17_21.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUsername(String username);
//	Long CountByEmail (String email);
//	Long CountByUsername (String username);


}
