package stepss;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public void beforemethod()
{
	System.out.println("under the before mtd");
}
@After
public void aftermethod()
{
	System.out.println("under the after mtd");
}

}
