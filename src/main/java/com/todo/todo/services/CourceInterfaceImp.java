package com.todo.todo.services;

import com.todo.todo.entities.CourceEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourceInterfaceImp implements CourcesInterface{

    @Autowired
    private  CourceDao courseDb;
    List<CourceEntities> list;


    @Override
    public List<CourceEntities> getCources() {
        List<CourceEntities>  result= courseDb.findAll();
        return result ;
    }

    /**
     * @param CourceID
     * @return
     */
    @Override
    public  Optional<CourceEntities>  getCource(long CourceID) {
      Optional<CourceEntities>  results= courseDb.findById(CourceID);
        return results ;
    }

    /**
     * @param couceBody
     * @return
     */
    @Override
    public List<CourceEntities> addCource(CourceEntities couceBody) {
            courseDb.save(couceBody);
            return courseDb.findAll();
    }
}
