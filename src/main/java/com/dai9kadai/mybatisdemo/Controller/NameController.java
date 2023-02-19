package com.dai9kadai.mybatisdemo.Controller;

import com.dai9kadai.mybatisdemo.Model.Name;
import com.dai9kadai.mybatisdemo.Service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> getNames(){
        return nameService.findAll();
    }
}
