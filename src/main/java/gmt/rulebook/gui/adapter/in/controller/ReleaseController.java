package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalRelease;
import gmt.rulebook.gui.domain.service.ReleaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RequiredArgsConstructor
@RequestMapping("/releases")
public class ReleaseController {

    @Autowired
    ReleaseService releaseService;

    @GetMapping("/getAllReleasesByStructureId/{structureId}")
    public List<MinimalRelease> getAllReleasesByStructureId(@PathVariable("structureId") Integer structureId){
        return releaseService.getAllReleasesByStructureId();
    }
}
