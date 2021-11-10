package io.davlac.graphql.application.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.davlac.graphql.domain.employee.Employee;
import io.davlac.graphql.domain.employee.EmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final EmployeeRepository employeeRepository;

    public Mutation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(String firstName, String lastName, Long departmentId) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setDepartmentId(departmentId);
        return employeeRepository.save(employee);
    }
}
