package pl.sda.finalproject.travelagency.trip.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.mappers.TripFormMapper;
import pl.sda.finalproject.travelagency.trip.mappers.TripMapper;
//import pl.sda.finalproject.travelagency.hotel.repositories.HotelsRepository;
import pl.sda.finalproject.travelagency.trip.repositories.TripRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {


    @Autowired
    public TripRepository tripRepository;

//    @Autowired
//    public HotelsRepository hotelsRepository;

    public List<TripDto> findAll(TripSearchCriteria tripSearchCriteria) {
        List<Specification<TripEntity>> searchCriterias = new ArrayList<>();

        if(tripSearchCriteria.getCityOfDeparture() != null && tripSearchCriteria.getCityOfDeparture() != CityOfDeparture.ALL){
            searchCriterias.add(((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("cityOfDeparture"), tripSearchCriteria.getCityOfDeparture())));
        }
        if(tripSearchCriteria.getCityOfArrival() != null && tripSearchCriteria.getCityOfArrival() != CityOfArrival.ALL){
            searchCriterias.add(((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("cityOfArrival"), tripSearchCriteria.getCityOfArrival())));
        }

        if(tripSearchCriteria.getStandard() != null && tripSearchCriteria.getStandard() != Standard.ALL){
            searchCriterias.add(((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("standard"), tripSearchCriteria.getStandard())));
        }
        if(tripSearchCriteria.getTripLength() != 0){
            searchCriterias.add(((root, query, criteriaBuilder) -> criteriaBuilder.equal((root.get("tripLength")), tripSearchCriteria.getTripLength())));
        }

        List<TripEntity> tripEntities = searchCriterias.stream()
                .reduce(Specification::and)
                .map((specification -> tripRepository.findAll(specification))).orElseGet(() -> tripRepository.findAll());
        return TripMapper.map(tripEntities);
    }


    public List<TripDto> findAll() {
        List<TripEntity> tripEntities = tripRepository.findAll();
        return TripMapper.map(tripEntities);
    }

    public Page<TripEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.tripRepository.findAll(pageable);
    }


    public List<TripDto> findByCityOfDepartureAndCityOfArrival(CityOfDeparture cityOfDeparture, CityOfArrival cityOfArrival){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfDepartureAndCityOfArrival(cityOfDeparture, cityOfArrival);
        return TripMapper.map(tripEntities);
    }

    public List<TripDto> findByCityOfDeparture(CityOfDeparture cityOfDeparture){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfDeparture(cityOfDeparture);
        return TripMapper.map(tripEntities);
    }

//    public List<TripDto> findByTripLength(long tripLength){
//        List<TripEntity> tripEntities = tripRepository.getAllByTripLength(TimeUnit.DAYS.convert(
////                Math.abs(getEndDate().getTime()- getBeginingDate().getTime()), TimeUnit.MILLISECONDS) + 1)
//    }

    public List<TripDto> findByCityOfArrival(CityOfArrival cityOfArrival){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfArrival(cityOfArrival);
        return TripMapper.map(tripEntities);
    }
    public List<TripDto> findByCountryOfArrival(Country country){
        List<TripEntity> tripEntities = tripRepository.getAllByCountryOfArrival(country);
        return TripMapper.map(tripEntities);
    }
//    public List<TripDto> findByCityOfArrival(CityOfDeparture cityOfDeparture){
//        List<TripEntity> tripEntities = tripRepository.getAllByCityOfArrival(cityOfDeparture);
//        return TripMapper.map(tripEntities);
//    }

    public TripDto getByUuid(String uuid){
        TripEntity trip = tripRepository.getByUuid(uuid);
        return TripMapper.map(trip);
    }


    public TripDto create(TripForm tripForm){
        TripEntity tripEntity = TripFormMapper.map(tripForm);
        TripEntity tripUpdate = tripRepository.saveAndFlush(tripEntity);
        return TripMapper.map(tripUpdate);
    }

    public TripDto update(String uuid, TripForm tripForm) {
        TripEntity trip = tripRepository.getByUuid(uuid)
                .setProm(tripForm.isProm())
                .setTripCost(tripForm.getTripCost())
                .setBeginingDate(tripForm.getBeginingDate())
                .setEndDate(tripForm.getEndDate())
                .setStandard(tripForm.getStandard())
                .setCountryOfArrival(tripForm.getCountryOfArrival())
                .setCityOfArrival(tripForm.getCityOfArrival())
                .setCityOfDeparture(tripForm.getCityOfDeparture())
                .setStandard(tripForm.getStandard())
                .setLongDescription(tripForm.getLongDescription())
                .setShortDescription(tripForm.getShortDescription());

//                .setHotelsEntity(tripForm.getHotelsEntity());

        TripEntity tripUpdated = tripRepository.saveAndFlush(trip);
        return TripMapper.map(tripUpdated);
    }
    public void createOrUpdate(TripForm tripForm) {
        if (tripForm.isNew()) {
            create(tripForm);
        } else {
            update(tripForm.getUuid(), tripForm);
        }
    }
    public void delete(String uuid) {
        TripEntity entity = tripRepository.getByUuid(uuid);
        tripRepository.delete(entity);
    }

    public List<TripDto> getAllByPromIsTrue() {
        List<TripEntity> tripEntities = tripRepository.getAllByPromIsTrue();
        return TripMapper.map(tripEntities);
    }



//   private TripEntity buyTrip(int tripId, int hotelId, HotelRoomEntity roomInfo){
//       TripEntity tripEntity = tripsRepository.findById(tripId).get();
//       TODO
//   }
}
