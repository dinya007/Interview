package preparation2019;

public enum HeapType {
    MAX {
        @Override
        public <T extends Comparable> int compare(T first, T second) {
            return first.compareTo(second);
        }
    },
    MIN {
        @Override
        public <T extends Comparable> int compare(T first, T second) {
            return -first.compareTo(second);
        }
    };

    public abstract <T extends Comparable> int compare(T first, T second);
}