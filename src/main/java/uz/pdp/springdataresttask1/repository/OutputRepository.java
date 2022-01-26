package uz.pdp.springdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.Output;
import uz.pdp.springdataresttask1.projection.CustomAttachment;
import uz.pdp.springdataresttask1.projection.CustomOutput;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
