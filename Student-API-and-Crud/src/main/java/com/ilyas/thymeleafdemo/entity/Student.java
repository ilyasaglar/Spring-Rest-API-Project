package com.ilyas.thymeleafdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_gen")
	@SequenceGenerator(name = "student_id_gen", sequenceName = "student_seq", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "tckimlikno")
	private String tcKimlikNo;

	@Column(name = "adi")
	private String firstName;

	@Column(name = "soyadi")
	private String lastName;

	@Column(name = "borcmiktari")
	private String borcTutari;

	@Column(name = "odemedurumu")
	private String borcDurumu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBorcTutari() {
		return borcTutari;
	}

	public void setBorcTutari(String borcTutari) {
		this.borcTutari = borcTutari;
	}

	public String getBorcDurumu() {
		return borcDurumu;
	}

	public void setBorcDurumu(String borcDurumu) {
		this.borcDurumu = borcDurumu;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", tcKimlikNo=" + tcKimlikNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", borcTutari=" + borcTutari + ", borcDurumu=" + borcDurumu + "]";
	}

	

	

}
