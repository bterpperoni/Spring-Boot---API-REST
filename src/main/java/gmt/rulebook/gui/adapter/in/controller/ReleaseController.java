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

    @GetMapping("/getRelease/{releaseId}")
    @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET})
    public ResponseEntity<MinimalRelease> getReleaseById(@PathVariable("releaseId") Integer releaseId) {
        MinimalRelease minimalRelease = releaseService.getReleaseById(releaseId);
        return ResponseEntity.ok().body(minimalRelease);
    }

    @PostMapping("/createRelease")
    @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.POST})
    public ResponseEntity<MinimalRelease> createRelease(@RequestBody MinimalRelease minimalRelease) {
        releaseService.createRelease(minimalRelease);
        return ResponseEntity.ok().body(minimalRelease);
    }

    @DeleteMapping("/deleteRelease/{releaseId}")
    @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.DELETE})
    public ResponseEntity<Void> deleteRelease(@PathVariable("releaseId") Integer releaseId) {
        releaseService.deleteRelease(releaseId);
        return ResponseEntity.ok().build();
    }

}
