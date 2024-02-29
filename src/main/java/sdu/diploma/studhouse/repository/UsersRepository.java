package sdu.diploma.studhouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdu.diploma.studhouse.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
