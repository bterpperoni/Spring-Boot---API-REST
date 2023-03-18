package gmt.rulebook.gui.domain.service;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
import gmt.rulebook.gui.adapter.out.release.ReleaseMapper;
import gmt.rulebook.gui.adapter.out.release.ReleaseRepository;
import gmt.rulebook.gui.domain.model.MinimalRelease;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Service
public class ReleaseService  {

   @Autowired
   private ReleaseMapper releaseMapper;

   @Autowired
   private ReleaseRepository releaseRepository;

    public List<MinimalRelease> getAllReleasesByStructureId() {
        List<MinimalRelease> minimalReleases = new ArrayList<>();
        List<ReleaseJpaEntity> releaseJpaEntities = releaseRepository.findAll();
        for(ReleaseJpaEntity releaseJpaEntity: releaseJpaEntities){
            minimalReleases.add(releaseMapper.mapFromEntityToModel(releaseJpaEntity));
        }
        return minimalReleases;
    }
}
