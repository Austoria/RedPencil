package testSrc;

import RedPencilSrc.RedPencil;

import static org.junit.Assert.*;
import org.junit.*;

public class pencilTest {
	RedPencil testPencil = new RedPencil();
	
	@Test
	public void whenRedPencilStatusIsPassedUnknownUPCItReturnsFalse() {
		assertEquals(false, testPencil.status("test string"));
	}
}
