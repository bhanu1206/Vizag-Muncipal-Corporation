package com.infinite.SpringbootExample.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.SpringbootExample.Model.Complaint;
import com.infinite.SpringbootExample.Model.UserLogin;
import com.infinite.SpringbootExample.service.IUserServiceImpl;

@Repository
public class IUserDaoImpl implements IUserDao {
	private static final Logger logger = Logger.getLogger(IUserDaoImpl.class);
	@Autowired
	SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public void insert(UserLogin userLogin) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(userLogin);
		
	}

	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		List<Complaint> ls=session.createQuery("from Complaint").list();
		return ls;
	}



	@Override
	public void update(Complaint complaint) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(complaint);
		
	}

}
