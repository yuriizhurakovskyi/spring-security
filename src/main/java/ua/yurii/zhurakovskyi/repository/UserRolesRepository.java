package ua.yurii.zhurakovskyi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ua.yurii.zhurakovskyi.domain.UserRole;

public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

	@Query("select a.role from UserRole a, User b where b.userName=?1 and a.userid=b.userId")
	public List<String> findRoleByUserName(String username);
}
