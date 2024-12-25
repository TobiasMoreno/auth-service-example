package hr.management.system.auth_service.repositories;

import hr.management.system.auth_service.entities.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITokenRepository extends JpaRepository<TokenEntity, Long> {
	Optional<TokenEntity> findByToken(String token);
}
