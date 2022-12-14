package org.seayaa.prometheus.server.config;

import com.netflix.discovery.DiscoveryClient;
import org.seayaa.prometheus.server.filter.CloudClientFilterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @Program: cloud
 * @Description:
 * @Author: Seayaa
 * @Create: 2021/5/1
 */
@Configuration
public class CloudBeanConfig {

    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() {
        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs = new DiscoveryClient.DiscoveryClientOptionalArgs();
        discoveryClientOptionalArgs.setAdditionalFilters(
                Collections.singletonList(new CloudClientFilterImpl()));
        return discoveryClientOptionalArgs;
    }
}
