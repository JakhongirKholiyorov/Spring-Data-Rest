package uz.pdp.springdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.AttachmentContent;
import uz.pdp.springdataresttask1.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    Boolean getActive();

    Category getParentCategory();
}
