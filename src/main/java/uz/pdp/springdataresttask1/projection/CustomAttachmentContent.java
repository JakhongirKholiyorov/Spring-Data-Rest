package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    String getBytes();

    Attachment getAttachment();
}
