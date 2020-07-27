package org.big.zoology.protection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p><b>ProtectionApplication</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/7/23 10:52
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProtectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtectionApplication.class);
    }
}
