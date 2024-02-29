package sdu.diploma.studhouse.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sdu.diploma.studhouse.entities.Advertisements;
import sdu.diploma.studhouse.repository.AdvertisementsRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final AdvertisementsRepository advertisementsRepository;

    @GetMapping("/test")
    public List<Advertisements> getTest() {
        return advertisementsRepository.findAll();
    }

}
