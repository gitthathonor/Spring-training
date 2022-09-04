package site.metacoding.training.domain.users;

import java.util.List;

import site.metacoding.training.web.dto.request.users.JoinDto;
import site.metacoding.training.web.dto.request.users.LoginDto;

public interface UsersDao {
	public List<Users> findAll();
	public void insert(JoinDto joinDto);
	public Users findById(Integer id);
//	public void delete(Integer id);
//	public void update(Users users);
	public Users login(LoginDto loginDto);
}
