package spring.boot.app.repositories;

import spring.boot.app.models.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamerasRepository extends MongoRepository<Camera, String> {
	  Camera findBy_id(String id);
	  
	}
