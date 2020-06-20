package Enum;

public enum StringOperator implements StringOperation {
    TO_UPPER {
        @Override
        public String perform(String value) {
            return value.toUpperCase();
        }

        @Override
        public String toOperatorString() {
            return "to_upper";
        }
    },
    TO_LOWER {
        @Override
        public String perform(String value) {
            return value.toLowerCase();
        }

        @Override
        public String toOperatorString() {
            return "to_lower";
        }
    },
    REVERSE {
        @Override
        public String perform(String value) {
            return new StringBuilder(value).reverse().toString();
        }

        @Override
        public String toOperatorString() {
            return "get_reverse";
        }
    };

    public abstract String toOperatorString();

    public String myToString() {
        return this.getClass() + ": " + super.toString();
    }
}
