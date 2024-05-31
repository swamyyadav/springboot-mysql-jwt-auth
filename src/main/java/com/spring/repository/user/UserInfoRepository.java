package com.spring.repository.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.user.UserInfo;



@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	public Optional<UserInfo> findByName(String username);
}
