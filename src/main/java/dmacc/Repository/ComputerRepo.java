/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Oct 11, 2022
 */
package dmacc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

@Repository
public interface ComputerRepo extends JpaRepository<Computer, Long> {
}
