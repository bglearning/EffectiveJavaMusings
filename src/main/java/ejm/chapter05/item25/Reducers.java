package ejm.chapter05.item25;

import java.util.ArrayList;
import java.util.List;

public class Reducers {
	
	public <E> E reduce(List<E> list, Function<E> f, E initVal) {
		
		List<E> snapshot;
		
		synchronized(list) {
			snapshot = new ArrayList<>(list);
		}
		
		E result = initVal;
		
		for (E element : snapshot) {
			result = f.apply(result, element);
		}
		
		return result;
		
	}
	
	public static final Function<Integer> SUM = new Function<Integer> () {
		@Override
		public Integer apply(Integer arg1, Integer arg2) {
			return arg1 + arg2;
		}
	};

}
