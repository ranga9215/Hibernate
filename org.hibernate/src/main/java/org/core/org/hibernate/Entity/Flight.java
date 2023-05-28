package org.core.org.hibernate.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "flight_info")
public class Flight implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name = "alt_key")
	private long altKey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="num_of_seats")
	private String numOfSeats;
	
	@Column(name="price")
	private String price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foriegn_key")
	private List<Airhosterss> airhostress;

	public long getAltKey() {
		return altKey;
	}
	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(String numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<Airhosterss> getAirhostress() {
		return airhostress;
	}

	public void setAirhostress(List<Airhosterss> airhostress) {
		this.airhostress = airhostress;
	}

}
