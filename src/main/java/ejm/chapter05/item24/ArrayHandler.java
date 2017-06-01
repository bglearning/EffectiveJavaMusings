package ejm.chapter05.item24;

import java.util.Objects;

public class ArrayHandler<T> {

	private T[] dataArray;

	public ArrayHandler(T[] dataArray) {
		this.dataArray = dataArray;
	}

	public int size() {
		return dataArray.length;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		@SuppressWarnings("unchecked")
		ArrayHandler<T> other = (ArrayHandler<T>) o;

		if (other.size() != this.size()) {
			return false;
		}

		for (int i = 0; i < this.size(); i++) {
			if (!other.dataArray[i].equals(dataArray[i])) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int hashCode() {

		int code = 31;

		for (int i = 0; i < this.size(); i++) {
			code += Objects.hash(dataArray[i]);
		}

		return code;
	}

}
