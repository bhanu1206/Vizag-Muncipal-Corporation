package com.infinite.SpringbootExample.repository;

import java.util.List;

import com.infinite.SpringbootExample.Model.Complaint;
import com.infinite.SpringbootExample.Model.UserLogin;

public interface IUserDao {
	public List<Complaint> getAllComplaints();
	public void insert(UserLogin userLogin);
	public void update(Complaint comp);
}
