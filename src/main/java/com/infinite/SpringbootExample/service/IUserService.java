package com.infinite.SpringbootExample.service;

import java.util.List;

import com.infinite.SpringbootExample.Model.Complaint;
import com.infinite.SpringbootExample.Model.UserLogin;

public interface IUserService {
	public List<Complaint> getAllComplaints();
	public void update(Complaint comp);
	public void insert(UserLogin userLogin);
}
