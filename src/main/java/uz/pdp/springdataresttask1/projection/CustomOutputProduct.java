package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.*;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Product getProduct();

    Output getOutput();
}
