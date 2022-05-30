package io.qaguru.owner.homework.providers;
import io.qaguru.owner.homework.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;

public class ApiConfigProvider {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
}