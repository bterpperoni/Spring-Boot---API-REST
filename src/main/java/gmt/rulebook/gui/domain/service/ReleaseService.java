package gmt.rulebook.gui.domain.service;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
import gmt.rulebook.gui.adapter.out.release.ReleaseMapper;
import gmt.rulebook.gui.adapter.out.release.ReleaseRepository;
import gmt.rulebook.gui.domain.model.MinimalRelease;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReleaseService  {

    private final ReleaseMapper releaseMapper;

    private final ReleaseRepository releaseRepository;

    public List<MinimalRelease> getAllReleasesByStructureId() {
        List<MinimalRelease> minimalReleases = new ArrayList<>();
        List<ReleaseJpaEntity> releaseJpaEntities = releaseRepository.findAll();
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
        ReleaseJpaEntity releaseJpaEntity = releaseMapper.mapFromModelToEntity(minimalRelease);
        releaseRepository.save(releaseJpaEntity);
        releaseMapper.mapFromEntityToModel(releaseJpaEntity);
    }

    public void deleteRelease(Integer releaseId) {
        releaseRepository.deleteById(String.valueOf(releaseId));
    }
}
