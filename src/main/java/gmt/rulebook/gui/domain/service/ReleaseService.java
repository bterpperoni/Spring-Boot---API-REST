package gmt.rulebook.gui.domain.service;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
import gmt.rulebook.gui.adapter.out.release.ReleaseMapper;
import gmt.rulebook.gui.adapter.out.release.ReleaseRepository;
import gmt.rulebook.gui.domain.model.MinimalRelease;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReleaseService  {

    private final ReleaseMapper releaseMapper;

    private final ReleaseRepository releaseRepository;

    public List<MinimalRelease> getAllReleasesByStructureId(Integer structureId) {
        List<MinimalRelease> minimalReleases = new ArrayList<>();
        List<ReleaseJpaEntity> releaseJpaEntities = releaseRepository.findAllByStructureId(structureId);
        for(ReleaseJpaEntity releaseJpaEntity: releaseJpaEntities){
            minimalReleases.add(releaseMapper.mapFromEntityToModel(releaseJpaEntity));
        }
        return minimalReleases;
    }

    public MinimalRelease getReleaseById(Integer releaseId) {
        ReleaseJpaEntity releaseJpaEntity = releaseRepository.findById(String.valueOf(releaseId)).orElse(null);
        return releaseMapper.mapFromEntityToModel(releaseJpaEntity);
    }

    public void createRelease(MinimalRelease minimalRelease) {
        // Transform the received model to an entity
        ReleaseJpaEntity releaseJpaEntity = releaseMapper.mapFromModelToEntity(minimalRelease);
        // Find if the release already exists
        Optional<ReleaseJpaEntity> releaseEntity = releaseRepository.findById(String.valueOf(minimalRelease.getReleaseId()));
        // If the release already exists, then add a prefix to the releaseId, otherwise, add a new releaseId
        if(releaseEntity.isPresent()){
            releaseJpaEntity.setReleaseId(minimalRelease.getReleaseId() + "-clone");
        }else{
            Integer maxReleaseId = releaseRepository.findMaxId();
            if(maxReleaseId == null){
                maxReleaseId = 0;
            }else{
                maxReleaseId++;
            }
            releaseJpaEntity.setReleaseId(String.valueOf(maxReleaseId));
        }
        releaseRepository.save(releaseJpaEntity);
    }

    public void deleteRelease(String releaseId) {
        releaseRepository.deleteById(String.valueOf(releaseId));
    }
}
