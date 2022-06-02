package pl.sda.finalproject.travelagency.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.City;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

@Repository
public interface HotelsRepository extends JpaRepository<HotelsEntity, Long>, JpaSpecificationExecutor<HotelsEntity> {
    HotelsEntity getByUuid(String uuid);
    HotelsEntity getByStandard(Standard standard);
    HotelsEntity getByCityOrCountry(City city, Country country);
    HotelsEntity getByCityAndStandard(City city, Standard standard);


}
