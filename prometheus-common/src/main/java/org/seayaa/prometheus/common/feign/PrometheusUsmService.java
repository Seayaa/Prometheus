package org.seayaa.prometheus.common.feign;

import org.seayaa.prometheus.common.feign.fallback.PrometheusUsmFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: dongd
 * @Date: 2022/12/16
 */
@FeignClient(value = "prometheus-usm", path = "/usm", fallback = PrometheusUsmFallback.class)
public interface PrometheusUsmService {

    @GetMapping("/ping")
    String ping();
}
