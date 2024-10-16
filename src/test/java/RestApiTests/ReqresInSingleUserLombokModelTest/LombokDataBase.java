package RestApiTests.ReqresInSingleUserLombokModelTest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LombokDataBase {
	String email, password;
	@JsonProperty ("first_name")  // аннотация из Ломбок для того, чтобы "_" переводить в "КэмелКейс"
	private String firstName;
	@JsonProperty ("last_name")   // аннотация из Ломбок для того, чтобы "_" переводить в "КэмелКейс"
	private String lastName;
}
