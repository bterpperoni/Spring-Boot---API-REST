package gmt.rulebook.gui.adapter.out.release;

import gmt.rulebook.gui.domain.model.Release;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class ReleaseMapper {
    ReleaseMapper MAPPER = Mappers.getMapper(ReleaseMapper.class);

    Release mapReleaseJpaEntityToModel(ReleaseJpaEntity releaseJpaEntity){
        return mapReleaseJpaEntityToModel(releaseJpaEntity);
    }

    ReleaseJpaEntity mapModelToReleaseJpaEntity(Release release){
        return mapModelToReleaseJpaEntity(release);
    }
}
