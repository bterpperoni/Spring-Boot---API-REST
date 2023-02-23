package gmt.rulebook.gui.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Release {
    @NonNull private String releaseId;
    private String releaseData;
    private LocalDateTime startingDate;
    private String rulebookCompiledBy;
    private LocalDateTime rulebookCompiledTime;
    private String rulebookValidatedBy;
    private LocalDateTime rulebookValidatedTime;
    @NonNull private String startDateModifiedBy;
    @NonNull private LocalDateTime startDateModifiedTime;
    @NonNull private String startDateValidatedBy;
    @NonNull private LocalDateTime startDateValidatedTime;
    @NonNull private String madeActiveBy;
    @NonNull private LocalDateTime madeActiveTime;
    @NonNull private String putInHistoricBy;
    @NonNull private LocalDateTime putInHistoricTime;
    @NonNull private int structureVersion;
}
