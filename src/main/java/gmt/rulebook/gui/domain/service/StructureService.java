package gmt.rulebook.gui.domain.service;

import gmt.rulebook.gui.adapter.out.structure.StructureJpaEntity;
import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import gmt.rulebook.gui.adapter.out.structure.StructureRepository;
import gmt.rulebook.gui.domain.model.MinimalStructure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StructureService {
    private final StructureRepository structureRepository;
    private final StructureMapper structureMapper;

    public List<MinimalStructure> getAllStructures() {
        List<StructureJpaEntity> all = structureRepository.findAll();
        return mapToMinimalStructures(all);
    }

    public MinimalStructure getStructureById(Integer structureId) {
        Optional<StructureJpaEntity> structureJpaEntity = structureRepository.findById(structureId);
        return structureJpaEntity.map(jpaEntity -> structureMapper.mapToMinimalStructure(jpaEntity)).orElse(null);
    }

    public List<MinimalStructure> mapToMinimalStructures(List<StructureJpaEntity> structureJpaEntities){
        List<MinimalStructure> minimalStructures = new ArrayList<>();
        for(StructureJpaEntity structureJpaEntity : structureJpaEntities){
            minimalStructures.add(structureMapper.mapToMinimalStructure(structureJpaEntity));
        }
        return minimalStructures;
    }

}
