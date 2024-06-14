package djonathanb.yourturn.game_catalog;

import djonathanb.yourturn.game_catalog.fixtures.integration.TestContainersFixtureConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.modulith.core.ApplicationModules;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import(TestContainersFixtureConfiguration.class)
class YourTurnGamesCatalogApplicationTests {

	@Autowired
	private TestContainersFixtureConfiguration testcontainersFixtureConfiguration;

	@Test
	void contextLoads() {
	}

	@Test
	void databaseConnection() {
		testcontainersFixtureConfiguration.runWithDatabase((databaseContainer) -> {
			var expectedJdbcUrl = "jdbc:postgresql://localhost:%d/game_catalog?loggerLevel=OFF".formatted(databaseContainer.getFirstMappedPort());
			assertEquals(expectedJdbcUrl, databaseContainer.getJdbcUrl());
		});
	}

	@Test
	void verifiesModularStructure() {
		var modules = ApplicationModules.of(YourTurnGamesCatalogApplication.class);
		modules.verify();
	}

}
