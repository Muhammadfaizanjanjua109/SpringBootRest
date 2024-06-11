package com.todo.todo.services;

import com.todo.todo.entities.CourceEntities;

import java.util.List;
import java.util.Optional;

public interface CourcesInterface {

    public List<CourceEntities> getCources();

    public Optional<CourceEntities> getCource(long CourceID);

    public  List<CourceEntities> addCource(CourceEntities couceBody);
}
