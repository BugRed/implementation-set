package entities;

import java.util.Objects;

public class LogAcess {
	private Integer number;

	public LogAcess(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "LogAcess [number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogAcess other = (LogAcess) obj;
		return Objects.equals(number, other.number);
	}
	

}
