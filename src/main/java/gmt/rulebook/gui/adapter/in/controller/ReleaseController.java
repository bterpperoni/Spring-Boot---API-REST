package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalRelease;
import gmt.rulebook.gui.domain.service.ReleaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ReleaseController {

    private final ReleaseService releaseService;

    @GetMapping("/getAllReleasesByStructureId/{structureId}")
    public List<MinimalRelease> getAllReleasesByStructureId(@PathVariable("structureId") Integer structureId) {
        return releaseService.getAllReleasesByStructureId(structureId);
    }

    @GetMapping("/releases/{releaseId}")
    public ResponseEntity<MinimalRelease> getReleaseById(@PathVariable("releaseId") Integer releaseId) {
        MinimalRelease minimalRelease = releaseService.getReleaseById(releaseId);
        return ResponseEntity.ok().body(minimalRelease);
    }

    @PostMapping(value ="/releases")
    public ResponseEntity<Void> createRelease(@RequestBody MinimalRelease minimalRelease) {
        releaseService.createRelease(minimalRelease);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/releases/{releaseId}")
    public ResponseEntity<Void> deleteRelease(@PathVariable("releaseId") String releaseId) {
        releaseService.deleteRelease(releaseId);
        return ResponseEntity.ok().build();
    }
}
