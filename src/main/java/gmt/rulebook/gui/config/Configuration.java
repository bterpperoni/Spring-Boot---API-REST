package gmt.rulebook.gui.config;

import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    /*
    @Autowired
    private StructureRepository structureRepository;
    private StructurePersistenceAdapter structurePersistenceAdapter = new StructurePersistenceAdapter(structureMapper,structureRepository);

    @Bean
    public StructureDatabaseHandler getStructureDatabaseHandler(){
        return structurePersistenceAdapter ;
    }

    @Bean
    public StructureUsesCases getStructureUsesCases(){
        return new StructureService(structurePersistenceAdapter);
    }
     */


    @Bean
    public StructureMapper getStructureMapper(){
        return Mappers.getMapper(StructureMapper.class);
    }

}
