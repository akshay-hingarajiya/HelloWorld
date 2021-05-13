package com.jenkins.demo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.util.Scanner;
import net.sourceforge.jwebunit.junit.JWebUnit.*;
/*
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
*/
import net.sourceforge.jwebunit.junit.WebTester;

import org.junit.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;


public class JWebUnitTest {
  /*  @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8081/junitwebapp");
    }*/
 
 @BeforeAll
static void beforeClass()
{
 System.out.println("running......beforeall");
}
 
    @Test
    public void testLoginPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("Hello AK");
    }

}
