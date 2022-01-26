package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.*;

import java.util.Date;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    String getCode();

    Boolean getActive();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();
}
