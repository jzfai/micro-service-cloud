package top.hugo.client.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import top.hugo.client.config.FeignConfiguration;
import top.hugo.common.core.domain.R;

@FeignClient(name="hugo-test",configuration = FeignConfiguration.class,path = "test")
public interface TestFeign {
    /**
     * 登录方法
     */
    @GetMapping("test")
    public R<String> login();
}
