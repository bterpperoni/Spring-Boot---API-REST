package gmt.rulebook.gui.config;

import gmt.rulebook.gui.adapter.out.release.ReleaseMapper;
import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManagerFactory;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public StructureMapper getStructureMapper(){
        return Mappers.getMapper(StructureMapper.class);
    }

    @Bean
    public ReleaseMapper getReleaseMapper(){
        return Mappers.getMapper(ReleaseMapper.class);
    }
}
