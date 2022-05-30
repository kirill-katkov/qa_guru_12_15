package io.qaguru.owner.homework.config;
import org.aeonbits.owner.Config;
@Config.Sources({
        "file:/tmp/auth.properties",
        "classpath:config/api.properties"
})


public interface ApiConfig extends Config{
    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();
}
