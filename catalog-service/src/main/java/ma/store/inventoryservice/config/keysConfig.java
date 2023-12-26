package ma.store.inventoryservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
public record keysConfig(RSAPublicKey publicKey) {
}
