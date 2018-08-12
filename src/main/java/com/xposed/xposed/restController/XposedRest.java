package com.xposed.xposed.restController;


import com.xposed.xposed.model.Xposed;
import com.xposed.xposed.service.XposedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/xposed")
@RestController
public class XposedRest {


    private static final Logger logger = LoggerFactory.getLogger(XposedRest.class);

    @Autowired
    XposedService xposedService;
    @PostMapping("/add")
    public String add(@RequestBody Xposed xposed){

        xposedService.createModel(xposed);

        return "Successfully Created";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable Long id){

        Xposed xposed = xposedService.getModelById(id);

        xposedService.createModel(xposed);

        return "Successful Updated";
    }



    @GetMapping("/{id}/get")
    public Xposed getById(@PathVariable Long id){

        Xposed xposed = xposedService.getModelById(id);

        return  xposed;
    }

    @GetMapping("/{id}/delete")
    public String deleteModel(@PathVariable Long id){
        Xposed xposed = xposedService.getModelById(id);

        xposedService.deleteModel(xposed);

        return "Successfully deleted";
    }

    @GetMapping("/all")
    public List<Xposed> getAll(){

        List<Xposed> xposedList = xposedService.getListOfModels("N");

        return xposedList;
    }





    @RequestMapping(
            value = "/**",
            method = RequestMethod.OPTIONS
    )

    public ResponseEntity handle() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
