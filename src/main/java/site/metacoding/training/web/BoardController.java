package site.metacoding.training.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;
import site.metacoding.training.domain.boards.Boards;
import site.metacoding.training.domain.boards.BoardsDao;
import site.metacoding.training.domain.boards.BoardsUsername;
import site.metacoding.training.web.dto.request.boards.UpdateDto;
import site.metacoding.training.web.dto.request.boards.WriteDto;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardsDao boardsDao;
	private final HttpSession session;
	
	
	@GetMapping({"/", "/boards"})
	public String getBoardList(Model model) {
		List<BoardsUsername> boardsList = boardsDao.findAll();
		model.addAttribute("boardsList",boardsList);
		return "boards/main";
	}
	
	@GetMapping("/boards/{id}")
	public String getBoard(@PathVariable Integer id, Model model) {
		Boards boards = boardsDao.findById(id);
		model.addAttribute("boards", boards);
		return "boards/detail";
	}
	
	@GetMapping("/boards/writeForm")
	public String writeForm() {
		if(session.getAttribute("principal") != null) {
			return "boards/writeForm";
		} else {
			return "redirect:/loginForm";
		}
	}
	
	@PostMapping("/write")
	public String write(WriteDto writeDto) {
		boardsDao.insert(writeDto);
		return "redirect:/";
	}
	
	@GetMapping("/boards/updateForm/{id}")
	public String updateForm(@PathVariable Integer id, Model model) {
		Boards boards = boardsDao.findById(id);
		model.addAttribute("boards", boards);
		return "boards/updateForm";
	}
	
	
	@PostMapping("/boards/update")
	public String update(UpdateDto updateDto) {
		boardsDao.update(updateDto);
		return "redirect:/";
	}
	
	@RequestMapping("/boards/delete/{id}")
	public String delete(@PathVariable Integer id) {
		boardsDao.delete(id);
		return "redirect:/";
	}
	
	
}
