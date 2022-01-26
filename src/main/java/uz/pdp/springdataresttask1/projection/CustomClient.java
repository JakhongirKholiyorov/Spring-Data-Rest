package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.AttachmentContent;
import uz.pdp.springdataresttask1.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    Attachment getPhoneNumber();
}
