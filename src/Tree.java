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
        if (this.is_empty()) {
            this.root = item;
            return true;
        }
        else if (this.subtrees.isEmpty()) {
            this.subtrees = new ArrayList<>();
            this.subtrees.add(new Tree(item, null));
            return true;
        }
        else {
            int rn = 1 + (int)(Math.random() * ((2) + 1));
            if (rn == 1) {
                this.subtrees.add(new Tree(item, null));
            }
            else {
                int subtree_index = (int)(Math.random() * ((this.subtrees.size()) + 1));
                this.subtrees.get(subtree_index).add(item);
            }
            return true;
        }
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
