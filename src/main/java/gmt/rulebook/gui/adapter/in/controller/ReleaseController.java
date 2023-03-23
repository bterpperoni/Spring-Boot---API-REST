package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalRelease;
import gmt.rulebook.gui.domain.service.ReleaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ReleaseController {

    private final ReleaseService releaseService;

    @GetMapping("/getAllReleasesByStructureId")
    public List<MinimalRelease> getAllReleasesByStructureId() {
        return releaseService.getAllReleasesByStructureId();
    }

    @GetMapping("/releases/{releaseId}")
    public ResponseEntity<MinimalRelease> getReleaseById(@PathVariable("releaseId") Integer releaseId) {
        MinimalRelease minimalRelease = releaseService.getReleaseById(releaseId);
        return ResponseEntity.ok().body(minimalRelease);
    }


    @PostMapping("/releases")
    public ResponseEntity<MinimalRelease> createRelease(@RequestBody MinimalRelease minimalRelease) {
        releaseService.createRelease(minimalRelease);
        return ResponseEntity.ok().body(minimalRelease);
    }

    @DeleteMapping("/releases/{releaseId}")
    public ResponseEntity<Void> deleteRelease(@PathVariable("releaseId") Integer releaseId) {
        releaseService.deleteRelease(releaseId);
        return ResponseEntity.ok().build();
    }
}
