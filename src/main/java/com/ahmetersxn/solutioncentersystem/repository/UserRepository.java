package com.ahmetersxn.solutioncentersystem.repository;

import com.ahmetersxn.solutioncentersystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Integer> {

    boolean existsByUsername(String username);

    User findUserByUsername(String username);

    @Transactional
    void deleteByUsername(String username);
}
