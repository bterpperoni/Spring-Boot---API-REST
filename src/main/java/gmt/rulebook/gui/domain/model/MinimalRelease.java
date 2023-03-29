package gmt.rulebook.gui.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MinimalRelease {
    private String releaseId;
    private String releaseData;
    private Date startingDate;
    private String rulebookCompiledBy;
    private Date rulebookCompiledTime;
    private String startDateModifiedBy;
    private Date startDateModifiedTime;
    private Integer structureVersion;

}
