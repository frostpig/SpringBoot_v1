package com.lss.repository;

import com.lss.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by shuangshuangl on 2018/8/30.
 */
@Repository
@Table(name = "user")
@Qualifier("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {
     User findAllById(Long id);

     User save(User u);

}
