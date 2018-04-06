package io.smart7.developer.springsecurity;

import io.smart7.developer.springsecurity.domain.Role;
import io.smart7.developer.springsecurity.domain.User;
import io.smart7.developer.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private  PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    createUserIfNotExists("user","user",Role.ROLE_USER);
        createUserIfNotExists("admin","admin",Role.ROLE_ADMIN);

	}

	private void createUserIfNotExists(String username, String password, Role role) {
		try {
			userRepository.save(new User(username, passwordEncoder.encode(password), role));
		} catch (Exception e) {

		}
	}
}
