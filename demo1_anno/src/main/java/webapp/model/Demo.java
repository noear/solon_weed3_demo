package webapp.model;

import lombok.Data;
import org.noear.weed.annotation.PrimaryKey;
import org.noear.weed.annotation.Table;

import java.time.LocalDate;

@Data
@Table("demo")
public class Demo {
	@PrimaryKey
	private Long id;

	private String name;

	private Long age;

	private String hobby;

	private LocalDate birthday;
}

