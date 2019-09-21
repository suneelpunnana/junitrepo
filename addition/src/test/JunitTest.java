package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		Junit test=new Junit();
		int result=test.add(100, 300);
		assertEquals(400,result);
	}

}
