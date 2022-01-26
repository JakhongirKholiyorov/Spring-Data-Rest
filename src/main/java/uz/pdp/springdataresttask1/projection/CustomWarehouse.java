package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Measurement;
import uz.pdp.springdataresttask1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();

    Boolean getActive();
}
