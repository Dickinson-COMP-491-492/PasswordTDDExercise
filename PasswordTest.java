import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void MakeDefaultPassword() {
		Password pass = new Password();
		assertNotNull("Password object not created", pass);
	}
}