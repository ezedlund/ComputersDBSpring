/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Oct 11, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String cpuBrand;
	private int cpuCoreCount;
	private String gpuBrand;
	private double vramCount;
	private String storage;
	@Autowired
	private DeliveryAddress address;

	public Computer() {
		super();
		this.name = "No PC Selected";
	}

	// Full pc
	public Computer(long id, String name, String cpuBrand, int cpuCoreCount, String gpuBrand, double vramCount,
			String storage, DeliveryAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.cpuBrand = cpuBrand;
		this.cpuCoreCount = cpuCoreCount;
		this.gpuBrand = gpuBrand;
		this.vramCount = vramCount;
		this.storage = storage;
		this.address = address;
	}

	// No storage
	public Computer(String name, String cpuBrand, int cpuCoreCount, String gpuBrand, double vramCount,
			DeliveryAddress address) {
		super();
		this.name = name;
		this.cpuBrand = cpuBrand;
		this.cpuCoreCount = cpuCoreCount;
		this.gpuBrand = gpuBrand;
		this.vramCount = vramCount;
		this.address = address;
	}

	// no gpu
	public Computer(String name, String cpuBrand, int cpuCoreCount, String storage, DeliveryAddress address) {
		super();
		this.name = name;
		this.cpuBrand = cpuBrand;
		this.cpuCoreCount = cpuCoreCount;
		this.storage = storage;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}

	public int getCpuCoreCount() {
		return cpuCoreCount;
	}

	public void setCpuCoreCount(int cpuCoreCount) {
		this.cpuCoreCount = cpuCoreCount;
	}

	public String getGpuBrand() {
		return gpuBrand;
	}

	public void setGpuBrand(String gpuBrand) {
		this.gpuBrand = gpuBrand;
	}

	public double getVramCount() {
		return vramCount;
	}

	public void setVramCount(double vramCount) {
		this.vramCount = vramCount;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", cpuBrand=" + cpuBrand + ", cpuCoreCount=" + cpuCoreCount
				+ ", gpuBrand=" + gpuBrand + ", vramCount=" + vramCount + ", storage=" + storage + ", address="
				+ address + "]";
	}

}
