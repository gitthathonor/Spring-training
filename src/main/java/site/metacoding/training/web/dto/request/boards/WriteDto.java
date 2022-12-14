package site.metacoding.training.web.dto.request.boards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WriteDto {
	private String title;
	private String content;
	private Integer usersId;
}
