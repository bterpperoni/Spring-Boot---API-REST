package gmt.rulebook.gui.adapter.in.controller;

import gmt.rulebook.gui.domain.model.MinimalStructure;
import gmt.rulebook.gui.domain.service.StructureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class StructureController {

    @Autowired
    StructureService structureService;

            @GetMapping("/getStructures")
            public List<MinimalStructure> getAllStructures(){
                return structureService.getAllStructures();
            }

            @GetMapping("/getStructure/{structureId}")
            public MinimalStructure getStructureById(@PathVariable("structureId") Integer structureId){
                return structureService.getStructureById(structureId);
            }

}
