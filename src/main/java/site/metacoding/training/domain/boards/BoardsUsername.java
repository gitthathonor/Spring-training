package site.metacoding.training.domain.boards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardsUsername {
	private Integer id;
	private String title;
	private String username;
}
