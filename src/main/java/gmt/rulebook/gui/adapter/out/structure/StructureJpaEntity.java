package gmt.rulebook.gui.adapter.out.structure;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
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
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "STRUCTURE_VERSION")
public class StructureJpaEntity {
    @Id
    @Column(name = "STRUCTURE_ID", nullable = false, length = 36)
    private Integer structureId;
    @Column(name = "DATA_")
    private String data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACTUAL_RELEASE")
    private ReleaseJpaEntity actualRelease;
}
