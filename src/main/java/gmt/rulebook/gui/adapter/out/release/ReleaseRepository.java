package gmt.rulebook.gui.adapter.out.release;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReleaseRepository extends JpaRepository<ReleaseJpaEntity, String> {
     /*
        Inherits from JpaRepository which contains basic CRUD SQL operations
        No need to create them
     */

    @Query("SELECT r FROM ReleaseJpaEntity r WHERE r.structureVersion = :structureId")
    List<ReleaseJpaEntity> findAllByStructureId(@Param("structureId") Integer structureId);
}
