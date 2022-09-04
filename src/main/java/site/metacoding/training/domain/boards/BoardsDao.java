package site.metacoding.training.domain.boards;

import java.util.List;

import site.metacoding.training.web.dto.request.boards.UpdateDto;
import site.metacoding.training.web.dto.request.boards.WriteDto;

public interface BoardsDao {
	public List<BoardsUsername> findAll();
	public Boards findById(Integer id);
	public void insert(WriteDto writeDto);
	public void update(UpdateDto updateDto);
	public void delete(Integer id);
}
