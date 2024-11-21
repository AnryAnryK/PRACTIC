package API;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DemoqaComSwaggerDataBase {
	String email;
	@JsonProperty ("first_name")
	private String first_name;  // аннотация из Ломбок для того, чтобы "_" переводить в "КэмелКейс"

}
