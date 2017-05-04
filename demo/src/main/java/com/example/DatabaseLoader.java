package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repository.save(new Employee("Bruce", "Wayne", "Monday","9-11"));
		this.repository.save(new Employee("Clark", "Kent", "Monday","11-1"));
		this.repository.save(new Employee("Ken", "Master", "Tuesday", "9-11"));
		this.repository.save(new Employee("Nirosh", "Jeganathan", "wednesday","12-4"));
		this.repository.save(new Employee("Luke", "Skywalker", "	Thursday","5-9"));
		this.repository.save(new Employee("Ken", "adams", "Sunday","9-11"));
	}
}
// end::code[]