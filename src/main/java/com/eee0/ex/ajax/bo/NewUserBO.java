package com.eee0.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eee0.ex.ajax.dao.NewUserDAO;
import com.eee0.ex.ajax.model.NewUser;

@Service
public class NewUserBO {

	@Autowired NewUserDAO newUserDAO; 
	
	//new_user 테이블 모든 내용 얻어오기
	public List<NewUser> getUserList() {
		
		return newUserDAO.selectNewUserList();
	};
	
	public int addUser(String name, String birthday, String introduce, String email) {
		return newUserDAO.insertUser(name, birthday, introduce, email);
	}
	
}
