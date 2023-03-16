package gmt.rulebook.gui.adapter.out.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column(name = "ACTUAL_RELEASE")
    private String actualRelease;
}
