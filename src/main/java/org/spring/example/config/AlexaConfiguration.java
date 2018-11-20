package org.spring.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "alexa")
public class AlexaConfiguration {

    @Value("${cache.ttl.seconds:300}")
    private int cacheTTL;

    @Value("${cache.size:150}")
    private int cacheSize;

    @Value("${cache.max.depth:1000}")
    private int cacheMaxDepth;

    public int getCacheTTL() {
        return cacheTTL;
    }

    public void setCacheTTL(int cacheTTL) {
        this.cacheTTL = cacheTTL;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public int getCacheMaxDepth() {
        return cacheMaxDepth;
    }

    public void setCacheMaxDepth(int cacheMaxDepth) {
        this.cacheMaxDepth = cacheMaxDepth;
    }
}
