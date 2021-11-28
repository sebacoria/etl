package org.sebacoria.etl.ui;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.sebacoria.etl.ui.EtlUiApp;
import org.sebacoria.etl.ui.config.TestSecurityConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EtlUiApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
