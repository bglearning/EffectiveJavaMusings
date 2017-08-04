package ejm.chapter05.item29;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<? extends T> type, T value) {

		if (type == null) {
			throw new NullPointerException("Type can't be null");
		}

		favorites.put(type, value);

	}

	public <T> T getFavorites(Class<T> type) {

		return type.cast(favorites.get(type));

	}

}
