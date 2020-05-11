package ua.yurii.zhurakovskyi.repository;

import org.springframework.stereotype.Repository;

import ua.yurii.zhurakovskyi.domain.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String username);
}
