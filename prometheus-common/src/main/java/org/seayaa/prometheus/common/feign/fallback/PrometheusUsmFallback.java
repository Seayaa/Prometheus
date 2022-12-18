package org.seayaa.prometheus.common.feign.fallback;

import org.seayaa.prometheus.common.feign.PrometheusUsmService;

/**
 * @author: dongd
 * @date: 2022/12/18
 */
public class PrometheusUsmFallback implements PrometheusUsmService {
    @Override
    public String ping() {
        return null;
    }
}
