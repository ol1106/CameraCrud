package spring.boot.app;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.app.repositories.CamerasRepository;
import spring.boot.app.models.Camera;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CamerasController {
	@Autowired
	private CamerasRepository repository;
	
	@GetMapping("/cameras")
	public List<Camera> index() {
		return repository.findAll();

	}

	@RequestMapping(value = "/cameras/{id}", method = RequestMethod.GET)
	public Camera get(@PathVariable("id") String id) {
		return repository.findBy_id(id);
	}


	@RequestMapping(value = "/cameras/{id}", method = RequestMethod.PUT)
	public Camera update(@PathVariable("id") String id, @Valid @RequestBody Camera camera) {
		camera.set_id(id);
		repository.save(camera);
		return camera;
	}

	@RequestMapping(value = "/cameras", method = RequestMethod.POST)
	public Camera store(@Valid @RequestBody Camera camera) {
		repository.save(camera);
		return camera;
	}

	@RequestMapping(value = "/cameras/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		repository.delete(repository.findBy_id(id));
	}

}
