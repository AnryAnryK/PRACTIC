package RandomValuesTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

public class RandomValueTestsStrings {
	public final String login;
	public final String password;
	public final String firstName;

	public RandomValueTestsStrings(String login, String password, String firstName) {
		this.login = login;
		this.password = password;
		this.firstName = firstName;
	}

	public static RandomValueTestsStrings getRandom() {
		final String login = RandomStringUtils.randomAlphabetic(10);
		final String password = RandomStringUtils.randomAlphabetic(10);
		final String firstName = RandomStringUtils.randomAlphabetic(10);
		return new RandomValueTestsStrings(login, password, firstName);
	}

	@Test
	public void testRandomValues() {
		RandomValueTestsStrings randomValueTestsStrings = RandomValueTestsStrings.getRandom();
	}
}
