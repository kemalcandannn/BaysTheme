package tr.bays.common.base;

import java.io.Serializable;

import javax.persistence.Version;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public abstract class BaseDto implements Serializable {
	private Long id;
	private Long version;
}
