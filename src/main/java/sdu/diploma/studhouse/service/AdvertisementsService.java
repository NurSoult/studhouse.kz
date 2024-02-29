package sdu.diploma.studhouse.service;

import org.springframework.stereotype.Service;
import sdu.diploma.studhouse.dto.AdvertisementsDto;

import java.util.List;

public interface AdvertisementsService {

    List<AdvertisementsDto> getAllAdvertisements();


}
