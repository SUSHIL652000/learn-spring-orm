package com.lcwd.orm.repositeries;

import com.lcwd.orm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
