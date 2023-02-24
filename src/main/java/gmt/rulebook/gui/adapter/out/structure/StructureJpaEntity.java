package gmt.rulebook.gui.adapter.out.structure;

import gmt.rulebook.gui.adapter.out.release.ReleaseJpaEntity;
import lombok.*;

import javax.persistence.*;

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
