package gmt.rulebook.gui.domain.service;

import gmt.rulebook.gui.adapter.out.structure.StructureJpaEntity;
import gmt.rulebook.gui.adapter.out.structure.StructureMapper;
import gmt.rulebook.gui.adapter.out.structure.StructureRepository;
import gmt.rulebook.gui.domain.model.MinimalStructure;
import gmt.rulebook.gui.port.in.StructureUsesCases;
import gmt.rulebook.gui.port.out.StructureDatabaseHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StructureService implements StructureUsesCases {
    /*
    .var à la fin d'une méthode génère la variable que la méthode retourne

     */
    @Autowired
    private StructureRepository structureRepository;

    @Autowired
    private StructureMapper structureMapper;

    @Override
    public List<MinimalStructure> getAllStructures() {
        List<StructureJpaEntity> all = structureRepository.findAll();
        return structureMapper.mapToMinimalStructures(all);
    }

    @Override
    public MinimalStructure getStructureById(int structureId) {

    }




}
