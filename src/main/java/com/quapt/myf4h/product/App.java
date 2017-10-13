/**
 * 
 */
package com.quapt.myf4h.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.net.UnknownHostException;

/**
 * @author user20
 *
 */
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * @param args
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(App.class);

        applicationBuilder.run(args);

    }

}
