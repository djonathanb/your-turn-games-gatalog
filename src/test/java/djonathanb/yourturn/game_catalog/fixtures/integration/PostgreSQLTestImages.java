package djonathanb.yourturn.game_catalog.fixtures.integration;

import org.testcontainers.utility.DockerImageName;

public class PostgreSQLTestImages {
    public static final DockerImageName POSTGRES_TEST_IMAGE = DockerImageName.parse("postgres:16.3-alpine3.20");
}
