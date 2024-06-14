package djonathanb.yourturn.game_catalog.fixtures.integration;

import org.springframework.boot.test.context.TestConfiguration;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.lifecycle.Startables;

import java.util.function.Consumer;
import java.util.stream.Stream;

@Testcontainers
@TestConfiguration
public class TestContainersFixtureConfiguration {

    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(PostgreSQLTestImages.POSTGRES_TEST_IMAGE)
            .withDatabaseName("game_catalog")
            .withUsername("test")
            .withPassword("test");

    static {
        Startables.deepStart(Stream.of(postgres)).join();
    }

    public PostgreSQLContainer<?> getDatabaseContainer() {
        return postgres;
    }

    public void runWithDatabase(Consumer<PostgreSQLContainer> consumer) {
        consumer.accept(getDatabaseContainer());
    }
}
