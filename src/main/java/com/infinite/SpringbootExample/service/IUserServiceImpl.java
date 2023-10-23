package com.infinite.SpringbootExample.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.SpringbootExample.Model.Complaint;
import com.infinite.SpringbootExample.Model.UserLogin;
import com.infinite.SpringbootExample.repository.IUserDao;
@Service
public class IUserServiceImpl implements IUserService{
	private static final Logger logger = Logger.getLogger(IUserServiceImpl.class);
	@Autowired 
	IUserDao userdao;

	@Transactional
	public void insert(UserLogin userLogin) {
		// TODO Auto-generated method stub
		userdao.insert(userLogin);
	}

	@Transactional
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		return userdao.getAllComplaints();
	}



	@Transactional
	public void update(Complaint comp) {
		// TODO Auto-generated method stub
		userdao.update(comp);
	}

}
