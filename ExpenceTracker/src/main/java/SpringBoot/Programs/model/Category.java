package SpringBoot.Programs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.FetchType;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {

	@Id
	private Long id;

	private String name;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User user;

	public String getid() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
