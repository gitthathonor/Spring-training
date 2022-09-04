package site.metacoding.training.web.dto.request.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeleteDto {
	private String username;
	private String password;
}
