package com.toyprj.db.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.toyprj.db.dto.Test;
import com.toyprj.db.mapper.TestMapper;
 
@Service
public class TestService {
 
    @Autowired
    TestMapper testMapper;
    
    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }
}

