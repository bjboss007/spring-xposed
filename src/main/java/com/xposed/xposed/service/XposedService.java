package com.xposed.xposed.service;

import com.xposed.xposed.model.Xposed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface XposedService {

    String createModel(Xposed xposed);

    String deleteModel(Xposed xposed);

    String updateModel(Xposed xposed);

    Xposed getModelById(Long id);

    Page<Xposed> getModelList(String delFlag, Pageable pageable);

    List<Xposed> getListOfModels(String delFlag);
}
