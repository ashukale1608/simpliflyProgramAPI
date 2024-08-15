package com.programapi.programcrud.repository;

import com.programapi.programcrud.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProgramDao extends JpaRepository<Program, String> {
}


//package com.programapi.programcrud.repository;
//
//import com.programapi.programcrud.entity.Program;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.UUID;
//
//@Repository
//public interface ProgramDao extends CrudRepository<Program, UUID> {
//
//
//
//
//}
