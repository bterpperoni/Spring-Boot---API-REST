package gmt.rulebook.gui.adapter.out.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructureRepository extends JpaRepository<StructureJpaEntity, Integer> {
     /*
        Inherits from JpaRepository which contains basic CRUD SQL operations
        No need to create them
     */
}
