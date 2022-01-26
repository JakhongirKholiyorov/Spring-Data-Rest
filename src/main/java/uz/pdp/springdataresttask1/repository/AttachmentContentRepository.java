package uz.pdp.springdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.AttachmentContent;
import uz.pdp.springdataresttask1.projection.CustomAttachment;
import uz.pdp.springdataresttask1.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachment/content", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
