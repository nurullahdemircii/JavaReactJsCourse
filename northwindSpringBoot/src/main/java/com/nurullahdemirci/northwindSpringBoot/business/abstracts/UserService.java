package com.nurullahdemirci.northwindSpringBoot.business.abstracts;

import com.nurullahdemirci.northwindSpringBoot.core.entities.User;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	
	DataResult<User> getByEmail(String email);
	
}
