package pl.sda.finalproject.travelagency.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import java.util.List;

@Repository
public interface HotelsRepository extends JpaRepository<HotelsEntity, Long>, JpaSpecificationExecutor<HotelsEntity> {


}