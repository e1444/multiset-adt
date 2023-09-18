public interface MultiSet {
    boolean add(Object item);
    void remove(Object item);
    boolean contains(Object item);
    boolean is_empty();
    int count(Object item);
    int size();
}
