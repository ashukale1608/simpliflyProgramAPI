package com.programapi.programcrud.controller;

import com.programapi.programcrud.model.ProgramDto;
import com.programapi.programcrud.model.ProgramRequest;
import com.programapi.programcrud.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/programs")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping("/{id}")
    public ResponseEntity<ProgramDto> getProgramById(@PathVariable String id) {
        return programService.getProgramById(id);
    }

    @PostMapping
    public ResponseEntity<ProgramDto> createProgram(@RequestBody ProgramRequest programRequest) {
        return programService.createProgram(programRequest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgramDto> updateProgram(@PathVariable String id, @RequestBody ProgramRequest programRequest) {
        return programService.updateProgram(id, programRequest);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteProgram(@PathVariable String id) {
        return programService.deleteProgram(id);
    }

    @GetMapping("/allProgram")
    public List<ProgramDto> getAllPrograms() {
        return programService.getAllPrograms();
    }
}

