package hr.management.system.auth_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {

	@Email(message = "Email is now formatted -> example@gmail.com")
	@NotEmpty(message = "Email is mandatory")
	@NotBlank(message = "Email is mandatory")
	private String email;
	@Size(min = 8, message = "Password should be at least 8 characters long minimum")
	@NotEmpty(message = "Password is mandatory")
	@NotBlank(message = "Password is mandatory")
	private String password;

}
