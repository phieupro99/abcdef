package com.msita.training.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@javax.persistence.Table(name="table",schema="cafedb")
public class Table implements Serializable{
	@Id
	@Column(name="idtable")
	private int id;
	
	@Column(name="type")
	private String type;

	@JsonIgnoreProperties("table")
	@OneToMany(cascade=CascadeType.ALL,mappedBy="table",fetch = FetchType.EAGER)
	private List<Order> lstOrder;
	
	public List<Order> getLstOrder() {
		return lstOrder;
	}

	public void setLstOrder(List<Order> lstOrder) {
		this.lstOrder = lstOrder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
