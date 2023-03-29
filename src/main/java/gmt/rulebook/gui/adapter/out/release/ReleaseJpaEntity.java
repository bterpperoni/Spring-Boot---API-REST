package gmt.rulebook.gui.adapter.out.release;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;
import java.util.Date;

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
    private Date startingDate;
    @Column(name = "RULEBOOK_COMPILED_BY", length = 10, nullable = false)
    private String rulebookCompiledBy;
    @Column(name = "RULEBOOK_COMPILED_TIME", nullable = false)
    private Date rulebookCompiledTime;
    @Column(name = "RULEBOOK_VALIDATED_BY", length = 10)
    private String rulebookValidatedBy;
    @Column(name = "RULEBOOK_VALIDATED_TIME")
    private Date rulebookValidatedTime;
    @Column(name = "START_DATE_MODIFIED_BY", length = 10, nullable = false)
    private String startDateModifiedBy;
    @Column(name = "START_DATE_MODIFIED_TIME", nullable = false)
    private Date startDateModifiedTime;
    @Column(name = "START_DATE_VALIDATED_BY", length = 10)
    private String startDateValidatedBy;
    @Column(name = "START_DATE_VALIDATED_TIME")
    private Date startDateValidatedTime;
    @Column(name = "MADE_ACTIVE_BY", length = 10)
    private String madeActiveBy;
    @Column(name = "MADE_ACTIVE_TIME")
    private Date madeActiveTime;
    @Column(name = "PUT_IN_HISTORIC_BY", length = 10)
    private String putInHistoricBy;
    @Column(name = "PUT_IN_HISTORIC_TIME")
    private Date putInHistoricTime;
    @Column(name = "STRUCTURE_VERSION", nullable = false)
    private Integer structureVersion;
}

