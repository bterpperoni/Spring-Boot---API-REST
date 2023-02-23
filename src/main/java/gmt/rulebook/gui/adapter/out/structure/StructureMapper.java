package gmt.rulebook.gui.adapter.out.structure;

import gmt.rulebook.gui.domain.model.MinimalStructure;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.ArrayList;
import java.util.List;

@Mapper
public abstract class StructureMapper {

    @Mappings(
            {
                    @Mapping(target = "structureId", source = "structureId"),
                    @Mapping(target = "data", source = "data")
            }
    )
    public abstract MinimalStructure mapToMinimalStructure(StructureJpaEntity structureEntity);

    public List<MinimalStructure> mapToMinimalStructures(List<StructureJpaEntity> structureJpaEntities){
        List<MinimalStructure> minimalStructures = new ArrayList<>();
        for(StructureJpaEntity structureJpaEntity : structureJpaEntities){
            minimalStructures.add(mapToMinimalStructure(structureJpaEntity));
        }
        return minimalStructures;
    }

}
