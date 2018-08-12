package com.xposed.xposed.repository;

import com.xposed.xposed.model.Xposed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XposedRepo extends JpaRepository<Xposed,Long> {


    Xposed getXposedById(Long id);

}
