package gmt.rulebook.gui.adapter.out.release;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends JpaRepository<ReleaseJpaEntity, String> {
     /*
        Inherits from JpaRepository which contains basic CRUD SQL operations
        No need to create them
     */
}
