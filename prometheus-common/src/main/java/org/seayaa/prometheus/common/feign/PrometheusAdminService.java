package org.seayaa.prometheus.common.feign;

import org.seayaa.prometheus.common.feign.fallback.PrometheusAdminFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: dongd
 * @Date: 2022/12/16
 */
@FeignClient(value = "prometheus-admin", path = "/admin", fallback = PrometheusAdminFallback.class)
public interface PrometheusAdminService {

    @GetMapping("/ping")
    String ping();
}
