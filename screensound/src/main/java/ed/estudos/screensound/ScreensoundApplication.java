package ed.estudos.screensound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ed.estudos.screensound.principal.Principal;
import ed.estudos.screensound.repository.ArtistaRepository;

@SpringBootApplication
public class ScreensoundApplication implements CommandLineRunner {
	
	@Autowired
	private ArtistaRepository artistaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScreensoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(artistaRepository);
		principal.exibeMenu();
		
	}

}
