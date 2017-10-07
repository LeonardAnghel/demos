package humanize.junit.sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(ReadableTest.class)
@DataJpaTest
public class HumanizeTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;
   
    @Test
    public void givenPersistedEmployeeWhenQueryByNameThenReturnTheCorrectEmployee() {

        Employee employee = new Employee();
        employee.setName("Constantin Alin");
        entityManager.persist(employee);
        entityManager.flush();

        Employee foundEmployee = employeeRepository.findByName(employee.getName());

        assertThat(foundEmployee.getName()).isEqualTo(employee.getName());
    }

}
