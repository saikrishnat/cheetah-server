package com.hackaton.cheetah.repository;

import java.util.List;

import com.hackaton.cheetah.model.Employee;
import com.hackaton.cheetah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
