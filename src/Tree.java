public class Tree implements MultiSet {
    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public boolean is_empty() {
        return false;
    }

    @Override
    public int count(Object item) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
