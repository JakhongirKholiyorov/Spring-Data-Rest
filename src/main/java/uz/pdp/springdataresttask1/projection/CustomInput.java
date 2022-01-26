package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.*;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Date getDate();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();
}
