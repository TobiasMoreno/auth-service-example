package hr.management.system.auth_service.services;

import hr.management.system.auth_service.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
	private IUserRepository userRepository;

}
