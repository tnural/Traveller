package com.geziyorum.controller.common;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geziyorum.argumentresolver.TokenUserId;
import com.geziyorum.dao.CommonDao;

@RestController
public class GetUserInfoByUserIdController {
	
	@Autowired
	CommonDao commonDao;
	
	 @RequestMapping(method = RequestMethod.POST, value="/getUserInfoById")
	public Object getPaylasimList(@RequestBody TokenUserId tokenUserId) throws IOException{
		 
		 return commonDao.getUserById(tokenUserId.getUserId());
		 

	}
	

}
