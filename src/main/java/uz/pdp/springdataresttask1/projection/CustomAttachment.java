package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    Double getSize();

    String getContentType();
}
