package com.spring.sihaHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sihaHospital.entity.Admin;
import com.spring.sihaHospital.repository.AdminRepository;


@Service
public class AdminServiceImplementation implements AdminService {

	private AdminRepository adminRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj)
	{
		adminRepository=obj;
	}
	
	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public void save(Admin admin)
	{
		
		adminRepository.save(admin);
	}

	@Override
	public Admin findByEmail(String user) {
		// TODO Auto-generated method stub
		
		return adminRepository.findByEmail(user);
		
	}

	@Override
	public List<Admin> findByRole(String user) {
		
		return adminRepository.findByRole(user);
	}

	
}
