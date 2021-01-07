package com.arg.javatechi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arg.javatechi.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
