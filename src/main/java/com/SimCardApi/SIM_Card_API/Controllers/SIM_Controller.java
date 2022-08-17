package com.SimCardApi.SIM_Card_API.Controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.SimCardApi.SIM_Card_API.Entities.Sim_Details;
import io.swagger.v3.oas.annotations.Operation;
import com.SimCardApi.SIM_Card_API.Services.SIM_Service;

@RestController
public class SIM_Controller {
	
	@Autowired
	private SIM_Service service;
	
	@Operation(summary = "This router will enable to enter new entry in the database",   description = " This router will enable to enter new entry in the database" , tags = "SIM")
	@RequestMapping(method = RequestMethod.POST , path = "/add")
	public ResponseEntity<Object> insertingSImDeatisl(@RequestBody Sim_Details details)
	{
		Sim_Details d=service.insert(details);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{Sim_card_no}").buildAndExpand(d.getSim_card_no()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@Operation(summary = "This router will list all records",   description = " This router will list all records" , tags = "SIM")
	@RequestMapping(method=RequestMethod.GET , path="/install")
	public List<Sim_Details> getAllRecords()
	{
		return service.getAllRecords();
	}
	
	@Operation(summary = "This router should update the record of the specific id",   description = " This router should update the record of the specific id" , tags = "SIM")
	@RequestMapping(method = RequestMethod.PUT , path="/sim/{id}")
	public Sim_Details updateSimDetail(@RequestBody Sim_Details details,@PathVariable("id") int num)
	{
		Sim_Details d=service.updateDetails(details,num);
		return details;
	}
	
	@Operation(summary = "This router should delete the record of the specific id",   description = " This router should delete the record of the specific id" , tags = "SIM")
	@RequestMapping(method = RequestMethod.DELETE , path="/{id}")
	public Sim_Details deleteRecordById(@PathVariable("id") int num)
	{
		Sim_Details d=service.deleteRecordById(num);
		return d;
	}

}
