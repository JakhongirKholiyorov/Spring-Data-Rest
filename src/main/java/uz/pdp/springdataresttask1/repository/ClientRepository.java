package uz.pdp.springdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.springdataresttask1.entity.Attachment;
import uz.pdp.springdataresttask1.entity.Category;
import uz.pdp.springdataresttask1.entity.Client;
import uz.pdp.springdataresttask1.projection.CustomAttachment;
import uz.pdp.springdataresttask1.projection.CustomCategory;
import uz.pdp.springdataresttask1.projection.CustomClient;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}