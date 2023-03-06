package gmt.rulebook.gui.adapter.out.release;

import gmt.rulebook.gui.adapter.out.structure.StructureJpaEntity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "RELEASE_")
public class ReleaseJpaEntity {
    @Id
    @Column(name = "RELEASE_ID", nullable = false, length = 36)
    private String releaseId;
    @Column(name = "DATA_", columnDefinition = "TEXT")
    private String releaseData;
    @Column(name = "STARTING_DATE")
    private LocalDateTime startingDate;
    @Column(name = "RULEBOOK_COMPILED_BY", length = 10)
    private String rulebookCompiledBy;
    @Column(name = "RULEBOOK_COMPILED_TIME")
    private LocalDateTime rulebookCompiledTime;
    @Column(name = "RULEBOOK_VALIDATED_BY", length = 10)
    private String rulebookValidatedBy;
    @Column(name = "RULEBOOK_VALIDATED_TIME")
    private LocalDateTime rulebookValidatedTime;
    @Column(name = "START_DATE_MODIFIED_BY", length = 10, nullable = false)
    private String startDateModifiedBy;
    @Column(name = "START_DATE_MODIFIED_TIME", nullable = false)
    private LocalDateTime startDateModifiedTime;
    @Column(name = "START_DATE_VALIDATED_BY", length = 10, nullable = false)
    private String startDateValidatedBy;
    @Column(name = "START_DATE_VALIDATED_TIME", nullable = false)
    private LocalDateTime startDateValidatedTime;
    @Column(name = "MADE_ACTIVE_BY", length = 10, nullable = false)
    private String madeActiveBy;
    @Column(name = "MADE_ACTIVE_TIME", nullable = false)
    private LocalDateTime madeActiveTime;
    @Column(name = "PUT_IN_HISTORIC_BY", length = 10, nullable = false)
    private String putInHistoricBy;
    @Column(name = "PUT_IN_HISTORIC_TIME", nullable = false)
    private LocalDateTime putInHistoricTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STRUCTURE_VERSION")
    private StructureJpaEntity structureVersion;
}

