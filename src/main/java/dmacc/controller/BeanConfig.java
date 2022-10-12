/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Oct 11, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.DeliveryAddress;

@Configuration
public class BeanConfig {

	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		return bean;
	}

	@Bean
	public DeliveryAddress deliveryAddress() {
		DeliveryAddress bean = new DeliveryAddress("123 Blank Street", "CITY", "STATE", 12345);
		return bean;
	}
}
