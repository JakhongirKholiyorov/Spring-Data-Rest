package uz.pdp.springdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.Input;
import uz.pdp.springdataresttask1.projection.CustomAttachment;
import uz.pdp.springdataresttask1.projection.CustomInput;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
