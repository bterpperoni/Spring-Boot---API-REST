package gmt.rulebook.gui.config;

import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public StructureMapper getStructureMapper(){
        return Mappers.getMapper(StructureMapper.class);
    }

}
