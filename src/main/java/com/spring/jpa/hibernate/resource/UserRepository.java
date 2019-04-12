package com.spring.jpa.hibernate.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usersRepository")
public interface UserRepository extends JpaRepository <Users, Integer> {
}
