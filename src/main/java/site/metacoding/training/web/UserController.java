package site.metacoding.training.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.training.domain.users.Users;
import site.metacoding.training.domain.users.UsersDao;
import site.metacoding.training.web.dto.request.users.JoinDto;
import site.metacoding.training.web.dto.request.users.LoginDto;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UsersDao usersDao;
	private final HttpSession session;
	
	
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "users/joinForm";
	}
	
	@PostMapping("/join")
	public String join(JoinDto joinDto) {
		usersDao.insert(joinDto);
		return "redirect:/login";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "users/loginForm";
	}
	
	@PostMapping("/login")
	public String login(LoginDto loginDto) {
		Users usersPS = usersDao.login(loginDto);
		if(usersPS != null) {
			session.setAttribute("principal", usersPS);
			return "redirect:/";
		} else {
			return "redirect:/loginForm";
		}
	}
	
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
	
}
