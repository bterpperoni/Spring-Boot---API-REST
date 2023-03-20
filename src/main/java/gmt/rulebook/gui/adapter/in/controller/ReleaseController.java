package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalRelease;
import gmt.rulebook.gui.domain.service.ReleaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/releases")
public class ReleaseController {

    private final ReleaseService releaseService;

    @GetMapping("/getAllReleasesByStructureId/{structureId}")
    @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET})
    public ResponseEntity<List<MinimalRelease>> getAllReleasesByStructureId(@PathVariable("structureId") Integer structureId) {
        List<MinimalRelease> minimalReleases = releaseService.getAllReleasesByStructureId(structureId);
        return ResponseEntity.ok().body(minimalReleases);
    }
}
