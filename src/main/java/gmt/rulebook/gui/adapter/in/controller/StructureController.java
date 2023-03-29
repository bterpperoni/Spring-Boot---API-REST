package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalStructure;
import gmt.rulebook.gui.domain.service.StructureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class StructureController {

    private final StructureService structureService;

            @GetMapping("/structures")
            public ResponseEntity<List<MinimalStructure>> getAllStructures(){
                List<MinimalStructure> minimalStructures = structureService.getAllStructures();
                return ResponseEntity.ok().body(minimalStructures);
            }

            @GetMapping("/getStructure/{structureId}")
            public ResponseEntity<MinimalStructure> getStructureById(@PathVariable("structureId") Integer structureId){
                MinimalStructure minimalStructure = structureService.getStructureById(structureId);
                return ResponseEntity.ok().body(minimalStructure);
            }
}
