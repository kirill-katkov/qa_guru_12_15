package io.qaguru.owner.homework.tests;
import io.qaguru.owner.homework.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class ApiTest {
    @Test
    void apiTestCheck() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("123token");
    }
}