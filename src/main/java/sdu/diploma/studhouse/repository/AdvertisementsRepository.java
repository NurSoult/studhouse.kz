package sdu.diploma.studhouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdu.diploma.studhouse.entities.Advertisements;

import java.util.List;

@Repository
public interface AdvertisementsRepository extends JpaRepository<Advertisements, Long> {

    @Override
    List<Advertisements> findAll();
}
