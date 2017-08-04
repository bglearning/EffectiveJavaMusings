package ejm.chapter05.item29;

public class App {

	public static void main(String[] args) {

		Favorites favorites = new Favorites();

		favorites.putFavorite(String.class, "momo");
		favorites.putFavorite(Integer.class, 7);
		favorites.putFavorite(Class.class, Favorites.class);

		String favString = favorites.getFavorites(String.class);
		Integer favNum = favorites.getFavorites(Integer.class);
		Class<?> favClass = favorites.getFavorites(Class.class);

		System.out.println(favString);
		System.out.println(favNum);
		System.out.println(favClass);

	}

}
