/**
 * @author debpaul
 *
 */
package com.worldline.batch.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.worldline.batch.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
