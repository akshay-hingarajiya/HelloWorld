
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
 
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;


public class JWebUnitTest {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        //setBaseUrl("http://localhost:8081/junitwebapp");
    }
 
 @BeforeAll
static void beforeClass()
{
 system.out.println("running......beforeall");
}
 
    @Test
    public void testLoginPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("Hello AK");
    }

}
