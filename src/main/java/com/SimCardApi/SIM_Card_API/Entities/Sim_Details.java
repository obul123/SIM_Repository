package com.SimCardApi.SIM_Card_API.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim_Details {
	
	@Id
	private int Sim_card_no;
	private int Mobile_no;
	private String Status;
	private Date Expiry_date;
	private String State_of_registration;
	private String KYC;
	private String Telecom_Provider;
	private String FUll_name;
	public Sim_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sim_Details(int sim_card_no, int mobile_no, String status, Date expiry_date, String state_of_registration,
			String kYC, String telecom_Provider, String fUll_name) {
		super();
		Sim_card_no = sim_card_no;
		Mobile_no = mobile_no;
		Status = status;
		Expiry_date = expiry_date;
		State_of_registration = state_of_registration;
		KYC = kYC;
		Telecom_Provider = telecom_Provider;
		FUll_name = fUll_name;
	}
	public int getSim_card_no() {
		return Sim_card_no;
	}
	public void setSim_card_no(int sim_card_no) {
		Sim_card_no = sim_card_no;
	}
	public int getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getExpiry_date() {
		return Expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		Expiry_date = expiry_date;
	}
	public String getState_of_registration() {
		return State_of_registration;
	}
	public void setState_of_registration(String state_of_registration) {
		State_of_registration = state_of_registration;
	}
	public String getKYC() {
		return KYC;
	}
	public void setKYC(String kYC) {
		KYC = kYC;
	}
	public String getTelecom_Provider() {
		return Telecom_Provider;
	}
	public void setTelecom_Provider(String telecom_Provider) {
		Telecom_Provider = telecom_Provider;
	}
	public String getFUll_name() {
		return FUll_name;
	}
	public void setFUll_name(String fUll_name) {
		FUll_name = fUll_name;
	}
	@Override
	public String toString() {
		return "Sim_Details [Sim_card_no=" + Sim_card_no + ", Mobile_no=" + Mobile_no + ", Status=" + Status
				+ ", Expiry_date=" + Expiry_date + ", State_of_registration=" + State_of_registration + ", KYC=" + KYC
				+ ", Telecom_Provider=" + Telecom_Provider + ", FUll_name=" + FUll_name + "]";
	}
	
	

}
