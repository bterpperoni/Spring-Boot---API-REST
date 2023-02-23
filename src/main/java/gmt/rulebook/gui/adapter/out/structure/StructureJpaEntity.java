package gmt.rulebook.gui.adapter.out.structure;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
@Table(name = "STRUCTURE_VERSION")
public class StructureJpaEntity {
    @Id
    @Column(name = "STRUCTURE_ID", nullable = false, length = 36)
    private int structureId;
    @Column(name = "DATA_")
    private String data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTUAL_RELEASE")
    private ReleaseJpaEntity actualRelease;
}
