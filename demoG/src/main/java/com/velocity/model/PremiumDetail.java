package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premiumdetails")
public class PremiumDetail {

	// id,name,city
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String premium_id;
	 private String policy_id;
	 private String policy_holdername;
	 private String installment_premiumamount;
	 private String policy_commencement_date;
	 private String policy_schedule_table;
	 private String policy_name;
	 private String plan_name;
	 private String user_name;
	 private String premium_amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremium_id() {
		return premium_id;
	}
	public void setPremium_id(String premium_id) {
		this.premium_id = premium_id;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_holdername() {
		return policy_holdername;
	}
	public void setPolicy_holdername(String policy_holdername) {
		this.policy_holdername = policy_holdername;
	}
	public String getInstallment_premiumamount() {
		return installment_premiumamount;
	}
	public void setInstallment_premiumamount(String installment_premiumamount) {
		this.installment_premiumamount = installment_premiumamount;
	}
	public String getPolicy_commencement_date() {
		return policy_commencement_date;
	}
	public void setPolicy_commencement_date(String policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}
	public String getPolicy_schedule_table() {
		return policy_schedule_table;
	}
	public void setPolicy_schedule_table(String policy_schedule_table) {
		this.policy_schedule_table = policy_schedule_table;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPremium_amount() {
		return premium_amount;
	}
	public void setPremium_amount(String premium_amount) {
		this.premium_amount = premium_amount;
	}
	
}
