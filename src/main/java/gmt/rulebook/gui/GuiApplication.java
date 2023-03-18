package gmt.rulebook.gui;

import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class GuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuiApplication.class, args);
	}
}
