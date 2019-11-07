package shoping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest {
	Homepage Hp;
	public HomepageTest() {
		Hp = new Homepage();
	}
	@Test
	public void verifyTabNavigation() {
		Hp.clickWomen();
		Assert.assertTrue(Hp.getTitlte().contains("Women"));
		Hp.clickDresses();
		Assert.assertTrue(Hp.getTitlte().contains("Dresses"));
		Hp.clickTshirts();
		Assert.assertTrue(Hp.getTitlte().contains("Tshirts"));
	}

}
