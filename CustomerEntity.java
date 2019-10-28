package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "employeeTbl")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long trasanctioncode;

	private String name;

	
	public Long getTrasanctioncode() {
		return trasanctioncode;
	}
	
	public void setTrasanctioncode(Long trasanctioncode) {
		this.trasanctioncode = trasanctioncode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
