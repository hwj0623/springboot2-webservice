package com.hwj0623.practice.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 불필요.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
