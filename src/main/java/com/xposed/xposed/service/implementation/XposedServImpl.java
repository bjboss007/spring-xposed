package com.xposed.xposed.service.implementation;

import com.xposed.xposed.model.Xposed;
import com.xposed.xposed.repository.XposedRepo;
import com.xposed.xposed.service.XposedService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class XposedServImpl implements XposedService {

    @Autowired
    XposedRepo xposedRepo;

    @Override
    public String createModel(Xposed xposed) {

        String result ;
        try{

            xposedRepo.save(xposed);

            result = "Successfully Created";

        }catch (Exception ex){
            result =  "Error";
        }

        return  result;

    }


    @Override
    public String deleteModel(Xposed xposed) {

        String result;
        try {
            xposed.setDelFlag("Y");
            xposedRepo.save(xposed);

            result = "Successfully Deleted";
        }catch (Exception ex){
            result = "Failed";

        }

        return result;

    }

    @Override
    public String updateModel(Xposed xposed) {

        String result = "";
        try{

            Xposed xposed1 = xposedRepo.getXposedById(xposed.getId());
            if (xposed1 != null){
//                BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
//                //BeanUtils.copyProperties(Destination, Source)
//                BeanUtils.copyProperties(xposed1,xposed);
            }

            result = "Successful";

        }catch (Exception ex){

        }

        return  result;
    }

    @Override
    public Xposed getModelById(Long id) {

        Xposed result = null;
        Optional<Xposed> tempXposed = xposedRepo.findById(id);

        if (tempXposed.isPresent()){
            Xposed xposed = tempXposed.get();
            result = xposed;
        }

        return result;
    }

    @Override
    public Page<Xposed> getModelList(String delFlag, Pageable pageable) {
        return null;
    }

    @Override
    public List<Xposed> getListOfModels(String delFlag) {
        return null;
    }
}
