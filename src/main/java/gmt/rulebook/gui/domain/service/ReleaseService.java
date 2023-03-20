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

    public List<MinimalRelease> getAllReleasesByStructureId(Integer structureId) {
        List<MinimalRelease> minimalReleases = new ArrayList<>();
        List<ReleaseJpaEntity> releaseJpaEntities = releaseRepository.findAllByStructureId(structureId);
        for(ReleaseJpaEntity releaseJpaEntity: releaseJpaEntities){
            minimalReleases.add(releaseMapper.mapFromEntityToModel(releaseJpaEntity));
        }
        return minimalReleases;
    }
}
