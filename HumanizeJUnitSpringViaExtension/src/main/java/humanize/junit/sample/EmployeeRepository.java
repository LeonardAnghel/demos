package humanize.junit.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
    public Employee findByName(String name);
 
}
