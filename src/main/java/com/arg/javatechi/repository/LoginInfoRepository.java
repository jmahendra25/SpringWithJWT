package com.arg.javatechi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arg.javatechi.entity.LoginInfo;

public interface LoginInfoRepository extends JpaRepository<LoginInfo, Integer> {

	LoginInfo findByUsername(String username);

}
