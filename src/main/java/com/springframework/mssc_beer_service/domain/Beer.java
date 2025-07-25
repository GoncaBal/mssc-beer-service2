package com.springframework.mssc_beer_service.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {

    @Id
    //@GeneratedValue(generator = "UUID")
    //@GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator") //depreciated
    @UuidGenerator
    @Column(length = 36, columnDefinition = "varchar",updatable = false,nullable = false)
    private UUID id;

    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;
    private String beerName;
    private String beerStyle;

    @Column(unique = true)
    private Long upc;

    private BigDecimal price;

    private Integer mindOnHand;
    private Integer quantityToBrew;
}
