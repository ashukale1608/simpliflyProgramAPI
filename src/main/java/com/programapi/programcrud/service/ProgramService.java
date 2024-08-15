//package com.programapi.programcrud.service;
//
//import com.programapi.programcrud.entity.Program;
//
//public interface ProgramService {
//
//    Program getProgramById(String id);
//}


package com.programapi.programcrud.service;

import com.programapi.programcrud.model.ProgramDto;
import com.programapi.programcrud.model.ProgramRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ProgramService {

    ResponseEntity<ProgramDto> getProgramById(String id);
    ResponseEntity<ProgramDto> createProgram(ProgramRequest programRequest);
    ResponseEntity<ProgramDto> updateProgram(String id, ProgramRequest programRequest);
    ResponseEntity<String> deleteProgram(String id);
    List<ProgramDto> getAllPrograms();
}

