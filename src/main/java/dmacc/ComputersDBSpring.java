package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.Repository.ComputerRepo;
import dmacc.beans.Computer;
import dmacc.beans.DeliveryAddress;
import dmacc.controller.BeanConfig;

@SpringBootApplication
public class ComputersDBSpring implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComputersDBSpring.class, args);
	}

	@Autowired
	ComputerRepo repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		Computer c = appContext.getBean("computer", Computer.class);
		c.setCpuBrand("Intel");
		c.setCpuCoreCount(20);
		c.setGpuBrand("Nvidia");
		c.setVramCount(12);
		c.setName("PowerSpec G404");
		c.setStorage("12 TB SSD NVMe 4th Gen");
		DeliveryAddress address = new DeliveryAddress("123 real street", "Bellevue", "WA", 98007);
		c.setAddress(address);
		repo.save(c);

		Computer c2 = new Computer("PowerSpec Err444", "AMD", 16, "2TB SSD", address);
		repo.save(c2);

		List<Computer> allComputers = repo.findAll();
		for (Computer pc : allComputers) {
			System.out.println(pc.toString());
		}

		((AbstractApplicationContext) appContext).close();
	}

}
