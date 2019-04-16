package com.test2.kcomplementary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test2.kcomplementary"})
@Slf4j
public class KComplementaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KComplementaryApplication.class, args);
	}

	@Autowired
    KComplementary complementaryV0;

	@Bean
    public ApplicationRunner commandLineRunner() {
        return args -> {
            String[] sourceArgs = args.getSourceArgs();
            if(sourceArgs.length<1) {
                log.error("Please specify two arguments, a comma separated int array and a k value");
                log.error("Usage: ./k-complementary 1,2,3,2,1 3");
            } else {
                String inputArr = sourceArgs[0];
                log.info("array: " + inputArr);
                String[] parts = inputArr.split(",");
                int[] arr = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    arr[i] = Integer.parseInt(parts[i]);
                }
                int k = Integer.parseInt(sourceArgs[1]);
                log.info("k: " + k);
                log.info("number of complementaries for k: " + k + " is: " + complementaryV0.countComplementaries(arr, k));
            }
        };
    }

}
