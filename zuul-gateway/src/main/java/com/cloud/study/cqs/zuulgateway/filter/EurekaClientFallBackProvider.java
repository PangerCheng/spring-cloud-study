package com.cloud.study.cqs.zuulgateway.filter;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientFallBackProvider implements FallbackProvider {
    @Override
    public String getRoute() {
        return "eureka-client";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return null;
    }
}
