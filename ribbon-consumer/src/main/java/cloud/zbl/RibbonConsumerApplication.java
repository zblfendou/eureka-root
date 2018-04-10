package cloud.zbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
        System.out.println("ribbonConsumerApplication started");
    }

    @LoadBalanced //表示开启客户端负载均衡。
    @Bean
    RestTemplate restTemplate() { //帮助我们发起一个GET或者POST请求
        return new RestTemplate();
    }
}
