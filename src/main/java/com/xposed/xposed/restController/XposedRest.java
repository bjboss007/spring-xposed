package com.xposed.xposed.restController;


import com.xposed.xposed.data.dto.FieldError;
import com.xposed.xposed.data.dto.ResponseData;
import com.xposed.xposed.model.Xposed;
import com.xposed.xposed.service.XposedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/xposed")
@RestController
public class XposedRest {


    @Autowired
    XposedService xposedService;
    @PostMapping("/add")
    public ResponseEntity<?> createOrUpdate(@RequestBody @Valid Xposed xposed, Errors errors){
        ResponseEntity resp = null;
        Xposed response = null;
        ResponseData dt = new ResponseData();

        try {
            if (errors.hasErrors()){
                List<FieldError> err_summary = errors.getFieldErrors().stream().map(f -> new FieldError(f.getField(),f.getDefaultMessage())).collect(Collectors.toList());
                dt.setError(err_summary);
                return ResponseEntity.badRequest().body(dt);
            }
            if (xposed.getId() != null){
                Xposed xposed2 = xposedService.getModelById(xposed.getId());
                CustomBeanUtilsBean.getInstance
            }
        }catch (){

        }

        if (xposed.getId() != null){
            xposedService.updateModel(xposed);
        }else {
            xposedService.createModel(xposed);
        }

        xposedService.createModel(xposed);

        return "Successfully Created";
    }

//    @PostMapping("/{id}/update")
//    public String update(@PathVariable Long id){
//
//        Xposed xposed = xposedService.getModelById(id);
//
//        xposedService.createModel(xposed);
//
//        return "Successful Updated";
//    }



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
