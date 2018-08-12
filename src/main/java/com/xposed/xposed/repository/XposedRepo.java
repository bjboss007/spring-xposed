package com.xposed.xposed.repository;

import com.xposed.xposed.model.Xposed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface XposedRepo extends JpaRepository<Xposed,Long> {

    List<Xposed> findByDelFlag(String delFlag);
    Xposed getXposedById(Long id);

}
