package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalStructure;
import gmt.rulebook.gui.domain.service.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class StructureController {

    @Autowired
    private StructureService structureService;

            @GetMapping("/getStructures")
            @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET})
            public ResponseEntity<List<MinimalStructure>> getAllStructures(){
                List<MinimalStructure> minimalStructures = structureService.getAllStructures();
                return ResponseEntity.ok().body(minimalStructures);
            }

            @GetMapping("/getStructure/{structureId}")
            @CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET})
            public ResponseEntity<MinimalStructure> getStructureById(@PathVariable("structureId") Integer structureId){
                MinimalStructure minimalStructure = structureService.getStructureById(structureId);
                return ResponseEntity.ok().body(minimalStructure);
            }
}
