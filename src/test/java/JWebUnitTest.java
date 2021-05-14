package JenkinsWar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
//import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import org.junit.*;
//import java.util.Scanner;


import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import net.sourceforge.jwebunit.junit.WebTester;
import org.junit.Before;
//import org.junit.Test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;


public class JWebUnitTest {
	@Before
	public void prepare() {
		//setBaseUrl("http://http://localhost:9090/JenkinsWar");
		// WebDriver driver = new FirefoxDriver();
    		//driver.get("http://http://localhost:9090/JenkinsWar");
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
		setBaseUrl("http://localhost:9090/JenkinsWar/");
	}
 
	
@BeforeAll
static void beforeClass()
{
 System.out.println("running......beforeall");
}
	@Test
	public void testLoginPage() {
		beginAt("/index.jsp"); 
		assertTitleEquals("Login");
		assertLinkPresent("home");
		clickLink("home");
		assertTitleEquals("Home");
	}
	
}
