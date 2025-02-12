package edu.cit.navigram.server.repository;

import edu.cit.navigram.server.model.Flag;
import edu.cit.navigram.server.model.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlagRepository extends JpaRepository<Flag, String> {
    List<Flag> findByMemory(Memory memory);
    
    long countByMemory(Memory memory);
    
    boolean existsByMemory(Memory memory);
}
