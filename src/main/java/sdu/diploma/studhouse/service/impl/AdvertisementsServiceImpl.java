package sdu.diploma.studhouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sdu.diploma.studhouse.dto.AdvertisementsDto;
import sdu.diploma.studhouse.repository.AdvertisementsRepository;
import sdu.diploma.studhouse.service.AdvertisementsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertisementsServiceImpl implements AdvertisementsService {

    private final AdvertisementsRepository advertisementsRepository;

    @Override
    public List<AdvertisementsDto> getAllAdvertisements() {
//        return advertisementsRepository.findAll();
        return null;
    }

    public boolean addAdvertisementToFavorites(Long userId, Long advertisementId) {
         //TODO adding to FAV, to create Favorite class
//        AdvertisementsDto advertisement = advertisementsRepository.findById(advertisementId)
//                .orElseThrow(() -> new IllegalArgumentException("Объявление не найдено"));
//
//        FavoriteDto favorite = new Favorite();
//        favorite.setUserId(userId);
//        favorite.setAdvertisement(advertisement);
//        favoritesRepository.save(favorite);

        return true;
    }



}
