package spring.boot.app.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cameras")
public class Camera {
	@Id
	public String _id;
	public String name;
	public String model;
	public Integer resolution;
	public String ip;

	public Camera() {

	}

	public Camera(String _id, String name, String model, Integer resolution, String ip) {
		super();
		this._id = _id;
		this.name = name;
		this.model = model;
		this.resolution = resolution;
		this.ip = ip;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getResolution() {
		return resolution;
	}

	public void setResolution(Integer resolution) {
		this.resolution = resolution;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
