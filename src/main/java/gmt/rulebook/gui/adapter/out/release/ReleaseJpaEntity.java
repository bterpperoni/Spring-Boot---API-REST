package gmt.rulebook.gui.adapter.out.release;

import lombok.Data;

import javax.persistence.*;

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
    @Column(name = "STARTING_DATE", nullable = false)
    private LocalDateTime startingDate;
    @Column(name = "RULEBOOK_COMPILED_BY", length = 10, nullable = false)
    private String rulebookCompiledBy;
    @Column(name = "RULEBOOK_COMPILED_TIME", nullable = false)
    private LocalDateTime rulebookCompiledTime;
    @Column(name = "RULEBOOK_VALIDATED_BY", length = 10)
    private String rulebookValidatedBy;
    @Column(name = "RULEBOOK_VALIDATED_TIME")
    private LocalDateTime rulebookValidatedTime;
    @Column(name = "START_DATE_MODIFIED_BY", length = 10, nullable = false)
    private String startDateModifiedBy;
    @Column(name = "START_DATE_MODIFIED_TIME", nullable = false)
    private LocalDateTime startDateModifiedTime;
    @Column(name = "START_DATE_VALIDATED_BY", length = 10)
    private String startDateValidatedBy;
    @Column(name = "START_DATE_VALIDATED_TIME")
    private LocalDateTime startDateValidatedTime;
    @Column(name = "MADE_ACTIVE_BY", length = 10)
    private String madeActiveBy;
    @Column(name = "MADE_ACTIVE_TIME")
    private LocalDateTime madeActiveTime;
    @Column(name = "PUT_IN_HISTORIC_BY", length = 10)
    private String putInHistoricBy;
    @Column(name = "PUT_IN_HISTORIC_TIME")
    private LocalDateTime putInHistoricTime;
    @Column(name = "STRUCTURE_VERSION", nullable = false)
    private Integer structureVersion;
}

