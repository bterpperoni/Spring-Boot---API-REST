package gmt.rulebook.gui.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MinimalStructure {
    @NonNull int structureId;
    private String data;
}
