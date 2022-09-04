package site.metacoding.training.web.dto.request.boards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateDto {
	private String title;
	private String content;
	private Integer id;
}
