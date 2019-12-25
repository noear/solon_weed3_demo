package webapp.model;

import lombok.Data;
import org.noear.weed.annotation.PrimaryKey;
import org.noear.weed.annotation.Table;

import java.time.LocalDate;

@Data
@Table("demo")
public class Demo {
	@PrimaryKey
	public Long id;
	
	public String name;
	
	public Long age;
	
	public String hobby;
	
	public LocalDate birthday;
}
