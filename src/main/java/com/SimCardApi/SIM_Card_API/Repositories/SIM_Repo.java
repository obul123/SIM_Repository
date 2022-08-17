package com.SimCardApi.SIM_Card_API.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SimCardApi.SIM_Card_API.Entities.Sim_Details;

@Repository
public interface SIM_Repo extends JpaRepository<Sim_Details, Integer>{

}
