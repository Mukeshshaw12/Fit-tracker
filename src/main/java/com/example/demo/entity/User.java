package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	private String mobile;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pincode;
	@NotNull
	private String trainerPreference;
	
	@Enumerated(EnumType.STRING)
	private PhysiotherapistRequirement physiotherapistRequirement;
	
	@Enumerated(EnumType.STRING)
	private PackageSelection packageSelection;
	
	private Integer weeks;
	
	private Double amount;
	
	@NotNull
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Appointment> appointments;
	
	public User() {
		
	}

	public User(Integer userId, String name, Integer age, String email, String mobile, String addressLine1,
			String addressLine2, String city, String state, String country, String pincode,
			@NotNull String trainerPreference, PhysiotherapistRequirement physiotherapistRequirement,
			PackageSelection packageSelection, Integer weeks, Double amount, @NotNull Set<Appointment> appointments) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.trainerPreference = trainerPreference;
		this.physiotherapistRequirement = physiotherapistRequirement;
		this.packageSelection = packageSelection;
		this.weeks = weeks;
		this.amount = amount;
		this.appointments = appointments;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTrainerPreference() {
		return trainerPreference;
	}

	public void setTrainerPreference(String trainerPreference) {
		this.trainerPreference = trainerPreference;
	}

	public PhysiotherapistRequirement getPhysiotherapistRequirement() {
		return physiotherapistRequirement;
	}

	public void setPhysiotherapistRequirement(PhysiotherapistRequirement physiotherapistRequirement) {
		this.physiotherapistRequirement = physiotherapistRequirement;
	}

	public PackageSelection getPackageSelection() {
		return packageSelection;
	}

	public void setPackageSelection(PackageSelection packageSelection) {
		this.packageSelection = packageSelection;
	}

	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	
}
