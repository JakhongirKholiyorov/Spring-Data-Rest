package uz.pdp.springdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.Measurement;
import uz.pdp.springdataresttask1.projection.CustomAttachment;
import uz.pdp.springdataresttask1.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
