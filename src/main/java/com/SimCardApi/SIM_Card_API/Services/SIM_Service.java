package com.SimCardApi.SIM_Card_API.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimCardApi.SIM_Card_API.Entities.Sim_Details;
import com.SimCardApi.SIM_Card_API.Repositories.SIM_Repo;

@Service
public class SIM_Service {
	
	@Autowired
	private SIM_Repo repo;

	
	public Sim_Details insert(Sim_Details details) {
		return repo.save(details);
	}

	public List<Sim_Details> getAllRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Sim_Details updateDetails(Sim_Details details, int num) {
		// TODO Auto-generated method stub
		if(repo.findById(num).isPresent())
		{
			Sim_Details d=repo.findById(num).get();
			d.setExpiry_date(details.getExpiry_date());
			d.setFUll_name(details.getFUll_name());
			d.setKYC(details.getKYC());
			d.setMobile_no(details.getMobile_no());
			d.setState_of_registration(details.getState_of_registration());
			d.setStatus(details.getStatus());
			d.setTelecom_Provider(details.getTelecom_Provider());
			
			repo.save(d);
			
			return details;
		}
		return null;
	}

	public Sim_Details deleteRecordById(int num) {
		// TODO Auto-generated method stub
		Optional<Sim_Details> details=repo.findById(num);
		repo.deleteById(num);
		return details.get();
		
	}

}
