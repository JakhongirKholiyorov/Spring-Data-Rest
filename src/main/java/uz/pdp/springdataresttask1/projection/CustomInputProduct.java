package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.*;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Product getProduct();

    Input getInput();
}
