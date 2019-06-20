package kr.or.kftc.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.kftc.sample.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}