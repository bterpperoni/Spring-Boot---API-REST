package gmt.rulebook.gui.adapter.out.release;

import gmt.rulebook.gui.adapter.out.GenericMapper;
import gmt.rulebook.gui.domain.model.MinimalRelease;
import org.mapstruct.Mapper;

@Mapper
public interface ReleaseMapper extends GenericMapper<MinimalRelease, ReleaseJpaEntity> {
    MinimalRelease mapFromEntityToModel(ReleaseJpaEntity releaseEntity);

    ReleaseJpaEntity mapFromModelToEntity(MinimalRelease minimalRelease);
}
