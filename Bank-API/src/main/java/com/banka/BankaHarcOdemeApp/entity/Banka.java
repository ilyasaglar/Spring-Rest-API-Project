package com.banka.BankaHarcOdemeApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "banka")
public class Banka {
	@Id
	@SequenceGenerator(name = "banka-numarator",sequenceName = "BANKA_SEQ",allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE,generator = "banka-numarator")
	private Integer id ;
	
	@Column(name = "TCKIMLIKNO")
	private Long tcKimlikNo ;
	
	@Column(name = "FIRST_NAME")
	private String firstName ;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "BORC_TUTARI")
	private Integer borcTutari;
	
	@Column(name = "BORC_DURUMU")
	private String borcDurumu ;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(Long tcKimlikNo) {
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
	public Integer getBorcTutari() {
		return borcTutari;
	}
	public void setBorcTutari(Integer borcTutari) {
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
		return "Banka [id=" + id + ", tcKimlikNo=" + tcKimlikNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", borcTutari=" + borcTutari + ", borcDurumu=" + borcDurumu + "]";
	}
	
	
	
	

}
