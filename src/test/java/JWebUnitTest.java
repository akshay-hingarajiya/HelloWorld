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

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import net.sourceforge.jwebunit.junit.WebTester;
import org.junit.Before;
//import org.junit.Test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import org.mortbay.jetty.testing.HttpTester;
//import org.apche.jasper.servlet.JspServlet;
import org.mortbay.jetty.testing.ServletTester;

import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import net.sourceforge.jwebunit.util.TestingEngineRegistry;
import net.sourceforge.jwebunit.junit.WebTestCase;
import net.sourceforge.jwebunit.junit.WebTester;
import junit.framework.TestCase;

/*public class JWebUnitTest {
	@Before
	public void prepare() {
		//setBaseUrl("http://http://localhost:9090/JenkinsWar");
		// WebDriver driver = new FirefoxDriver();
    		//driver.get("http://http://localhost:9090/JenkinsWar");
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
		JWebUnit.setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_WEBDRIVER); 
		setBaseUrl("http://localhost:9090/JenkinsWar");
	}
	
	private WebTester tester;

   @Before
    public void prepare() {
        tester = new WebTester();
	tester.setResourceBase("./src/main/webapp");
	tester.addServlet(jspServlet.class,"*.jsp");
	tester.setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        tester.setBaseUrl("http://localhost:9090/JenkinsWar");
    }
 
	
@BeforeAll
static void beforeClass()
{
 System.out.println("running......beforeall");
}
	@Test
	public void testLoginPage() {
		tester.beginAt("test/java/index.jsp"); 
		tester.assertTitleEquals("Login");
		tester.assertLinkPresent("home");
		tester.clickLink("home");
		tester.assertTitleEquals("Home");
	}
	
	@Test
	public void testHomePage() {
		tester.beginAt("test/java/home.jsp"); 
		tester.assertTitleEquals("Home");
		tester.assertLinkPresent("login");
		tester.clickLink("login");
		tester.assertTitleEquals("Login");
	}
	
}*/
public class JWebUnitTest extends TestCase {
	ServletTester tester = new ServletTester();
	HttpTester request = new HttpTester();
	HttpTester response = new HttpTester();

	public void setUp() throws Exception {
		tester.setResourceBase("./src/main/webapp");
		//tester.addServlet(JspServlet.class, "*.jsp");
		tester.start();

		request.setMethod("GET");
		request.setVersion("HTTP/1.0");
	}

	public void testIndex() throws Exception {
		request.setURI("index.jsp");
		response.parse(tester.getResponses(request.generate()));

		assertTrue(response.getMethod() == null);
		assertEquals(200, response.getStatus());
		assertEquals("<html><body>Hello World</body></html>", response
				.getContent());
	}
}
