package com.xposed.xposed.repository;

import com.xposed.xposed.model.Adminstrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminstratorRepo extends JpaRepository<Adminstrator,Long> {
}
