package tr.bays.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@MappedSuperclass
@ToString
public class VersionedBaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	protected Long id;

	@Version
	@Column(name = "VERSION")
	private Long version;

}
