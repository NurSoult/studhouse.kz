package sdu.diploma.studhouse.dto;


import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import sdu.diploma.studhouse.entities.Landlords;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class AdvertisementsDto {

    private Long id;
    private String title;
    private BigDecimal price;
    private String location;
    private String imagePaths;
    private String author;
    private LocalDateTime creationDate;
    private String description;
    private Integer typeOfHouse;
    private Integer numberOfRooms;
    private Integer floor;
    private Integer square;

}
