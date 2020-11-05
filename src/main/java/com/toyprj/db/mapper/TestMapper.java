package com.toyprj.db.mapper;
 
import java.util.List;
 
import com.toyprj.db.dto.Test;
 
public interface TestMapper {
 
    public List<Test> getAll() throws Exception;
    
}
