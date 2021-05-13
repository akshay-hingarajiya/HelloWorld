package junitwebapp;
import static pkg.Class.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
//import net.sourceforge.jwebunit.junit.JWebUnit;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
import net.sourceforge.jwebunit.junit.WebTester;

import org.junit.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;


public class JWebUnitTest {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8081/junitwebapp");
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
