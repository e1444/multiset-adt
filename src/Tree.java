import java.util.ArrayList;

public class Tree implements MultiSet {

    private Object root;
    private ArrayList<Tree> subtrees;

    public Tree(){

    }

    public Tree(Object root, ArrayList<Tree> subtrees){
        this.subtrees = subtrees;
        this.root = root;
    }


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
        return this.subtrees.isEmpty();
    }

    @Override
    public int count(Object item) {
        int count = 0;
        if (this.root == item) {
            count += 1;
        }
        for(Tree t: this.subtrees){
            count += t.count(item);
        }
        return count;
    }

    @Override
    public int size() {
        int count = 1;
        for(Tree t: this.subtrees){
            count += t.size();
        }
        return count;
    }
}
