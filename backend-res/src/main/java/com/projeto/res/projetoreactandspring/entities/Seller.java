package com.projeto.res.projetoreactandspring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "tb_sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	@OneToMany(mappedBy = "seller") //NOME DO ATRIBUTO NA OUTRA CLASSE DO RELACIONAMENTO.
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
		
		
	}
	
	public Seller(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
