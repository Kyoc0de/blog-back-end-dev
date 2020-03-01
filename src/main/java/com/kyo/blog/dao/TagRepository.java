package com.kyo.blog.dao;


import com.kyo.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
