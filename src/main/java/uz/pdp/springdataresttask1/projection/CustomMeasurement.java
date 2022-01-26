package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.Client;
import uz.pdp.springdataresttask1.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    Boolean getActive();
}
