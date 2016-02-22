package quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Class for generating quotes. 
 * @JsonIgnoreProperties serialization/deserialization of unknown properties
 * @author drau
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public Value getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Value value) {
		this.value = value;
	}
    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
