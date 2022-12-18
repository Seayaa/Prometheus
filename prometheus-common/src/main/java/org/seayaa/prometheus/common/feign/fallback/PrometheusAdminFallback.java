package org.seayaa.prometheus.common.feign.fallback;

import org.seayaa.prometheus.common.feign.PrometheusAdminService;
import org.springframework.stereotype.Component;

/**
 * @author: dongd
 * @date: 2022/12/18
 */
@Component
public class PrometheusAdminFallback implements PrometheusAdminService {
    @Override
    public String ping() {
        return null;
    }
}
