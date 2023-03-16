package gmt.rulebook.gui.adapter.out.structure;

import gmt.rulebook.gui.adapter.out.GenericMapper;
import gmt.rulebook.gui.domain.model.MinimalStructure;
import org.mapstruct.Mapper;

@Mapper
public interface StructureMapper extends GenericMapper<MinimalStructure, StructureJpaEntity> {
    MinimalStructure mapFromEntityToModel(StructureJpaEntity structureEntity);
    StructureJpaEntity mapFromModelToEntity(MinimalStructure minimalStructure);
}
