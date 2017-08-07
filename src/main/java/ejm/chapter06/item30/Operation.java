package ejm.chapter06.item30;

import java.util.Map;
import java.util.HashMap;

public enum Operation {

	ADDITION("+", Validator.NONE) {
		public double apply(double a, double b) {
			validator.validate(a, b);
			return a + b;
		}
	},

	SUBTRACTION("-", Validator.NONE) {
		public double apply(double a, double b) {
			validator.validate(a, b);
			return a - b;
		}
	},

	MULTIPLICATION("*", Validator.NONE) {
		public double apply(double a, double b) {
			validator.validate(a, b);
			return a * b;
		}
	},

	DIVISION("/", Validator.NO_ZERO_OP) {
		public double apply(double a, double b) {
			validator.validate(a, b);
			return a / b;
		}
	};

	private final String symbol;

	protected final Validator validator;

	private static Map<String, Operation> symbolMap = new HashMap<>();

	static {
		for (Operation op : Operation.values()) {
			symbolMap.put(op.toString(), op);
		}
	}

	public static Operation fromString(String s) {
		return symbolMap.get(s);
	}

	private Operation(String symbol, Validator validator) {
		this.symbol = symbol;
		this.validator = validator;
	}

	abstract public double apply(double a, double b);

	@Override
	public String toString() {
		return symbol;
	}

	private enum Validator {
		NONE {
			@Override
			void validate(double a, double b) {
				// No operation
			}
		},
		NO_ZERO_OP {
			@Override
			void validate(double a, double b) {
				if (b < 0.00001 && b > -.00001) {
					throw new IllegalArgumentException("Second argument can't be zero");
				}
			}

		};

		abstract void validate(double a, double b);
	}

}
