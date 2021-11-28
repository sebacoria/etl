package org.sebacoria.etl.ui.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.sebacoria.etl.ui.EtlUiApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = EtlUiApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
