package dev.tpcoder.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@Import(TestContainerConfig.class)
public class TestCouponApplication {

	public static void main(String[] args) {
		SpringApplication.from(CouponApplication::main).with(TestCouponApplication.class).run(args);
	}

}
