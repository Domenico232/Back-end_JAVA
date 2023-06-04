package com.proj.weekproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.weekproject.entity.User;



@Repository
public interface UserDaoRepository extends JpaRepository<User, Long> {
// methods

}
