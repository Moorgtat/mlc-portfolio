package com.mlc.portfolio;

//import com.mlc.portfolio.models.Identity;
//import com.mlc.portfolio.repository.IdentityRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPortfolioApplication implements CommandLineRunner{

//	@Autowired
//	private IdentityRepository identityRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPortfolioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Identity identity1 = identityRepository.save(new Identity("Mathieu Le Cardinal",
//				"Developpeur Full Stack",
//				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
//				"mat.lecardinal@gmail.com",
//				"github",
//				"twitter"));
	}

}
