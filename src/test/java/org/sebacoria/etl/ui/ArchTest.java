package org.sebacoria.etl.ui;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("org.sebacoria.etl.ui");

        noClasses()
            .that()
            .resideInAnyPackage("org.sebacoria.etl.ui.service..")
            .or()
            .resideInAnyPackage("org.sebacoria.etl.ui.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..org.sebacoria.etl.ui.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
