package com.todo.todo.Controller;

import com.todo.todo.entities.CourceEntities;
import com.todo.todo.services.CourcesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourceController {

    private  CourcesInterface courceService ;

    @Autowired
    public CourceController(CourcesInterface courceService) {
        this.courceService = courceService;
    }
    @GetMapping("/home")
    public String home() {
        return  "hello world";
    }

    @GetMapping("/cources")
    public List<CourceEntities> getCources() {
        return this.courceService.getCources();
    }

    @GetMapping("/cources/{courceID}")
    public Optional<CourceEntities> getCources(@PathVariable String courceID) {

            return this.courceService.getCource(Long.parseLong(courceID));

    }


    @PostMapping("/cources")
    public List<CourceEntities> addCource(@RequestBody CourceEntities couceBody){
        return  this.courceService.addCource(couceBody);
    }

}
