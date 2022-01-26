package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Measurement;
import uz.pdp.springdataresttask1.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}
