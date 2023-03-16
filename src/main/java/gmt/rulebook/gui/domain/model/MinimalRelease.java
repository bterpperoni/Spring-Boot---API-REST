package gmt.rulebook.gui.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MinimalRelease {
    private String releaseId;
    private String releaseData;
    private LocalDateTime startingDate;
    private String rulebookCompiledBy;
    private LocalDateTime rulebookCompiledTime;
    private String startDateModifiedBy;
    private LocalDateTime startDateModifiedTime;
    private Integer structureVersion;

    /************************************
     @Properties - for the full Release further model
      *      private String rulebookValidatedBy;
      *      private LocalDateTime rulebookValidatedTime;
      *      private String startDateValidatedBy;
      *      private LocalDateTime startDateValidatedTime;
      *      private String madeActiveBy;
      *      private LocalDateTime madeActiveTime;
      *      private String putInHistoricBy;
      *      private LocalDateTime putInHistoricTime;
     */

}
