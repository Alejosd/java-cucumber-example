package alejo.sd;

import java.util.List;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class Steps {
	@Given("the following animals: (.*)")
	public void the_following_animals(List<String> animals) {
		System.out.println( animals.get(0) );
		Assert.assertEquals("cow",animals.get(0));
	}
}
