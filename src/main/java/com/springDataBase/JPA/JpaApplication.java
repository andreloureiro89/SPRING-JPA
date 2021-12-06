package com.springDataBase.JPA;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springDataBase.JPA.entity.Person;
import com.springDataBase.JPA.springData.PersonSpringDataRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	PersonRepository repository;
	
	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info(" ");
		logger.info(" ===== INICIATE ====== ");
		logger.info(" ");
		logger.info(" ============ INSERTING PEOPLE =======> ");
		logger.info(" ============ ");
		repository.save(new Person(1, "Jack", "California", "12.02-1998"));
		repository.save(new Person(2, "Chris", "Barcelona", "09-11-1978"));
		repository.save(new Person(3, "Clair", "Lisbon", "15-12-1999"));
		logger.info(" ");
		logger.info(" ");
		logger.info(" ============ FIND BY ID 1 =======> ");
		logger.info(" RESULT: "  + repository.findById(1));
		logger.info(" ");
		logger.info(" ");
		logger.info(" ============ UPDATE PEOPLE =======> ");
		Optional<Person> data = repository.findById(1);
		Person updatePerson = data.get();
		updatePerson.setLocation("BERLIN");
		repository.save(updatePerson);
		logger.info(" PERSON WITH ID 1 UPDATED");
		logger.info(" RESULT: "  + repository.findById(1));
		logger.info(" ");
		logger.info(" ");
		logger.info(" ============ DELETE PEOPLE WITH ID 2 =======> ");
		logger.info(" ============ ");
		repository.deleteById(2);
		logger.info(" ");
		logger.info(" ");
		logger.info(" ============ GET ALL PEOPLE =======> ");
		logger.info(" ============ ");
		logger.info(" ALL USERS : " + repository.findAll());
		
	}

	
}
