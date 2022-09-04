package site.metacoding.training.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping({"/","/boards"})
	public String getBoardList() {
		return "boards/main";
	}
	
	
	
	
}
