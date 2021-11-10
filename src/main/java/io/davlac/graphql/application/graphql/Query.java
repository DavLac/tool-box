package io.davlac.graphql.application.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.davlac.graphql.domain.employee.Employee;
import io.davlac.graphql.domain.employee.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final EmployeeRepository employeeRepository;

    public Query(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
