package eg.edu.alexu.csd.filestructure.btree;

import java.util.ArrayList;
import java.util.List;

public class BTreeNode<K extends Comparable<K>, V> implements IBTreeNode<K, V> {
    private List<K> keys;
    private List<V> values;
    private List<IBTreeNode<K, V>> children;


    public BTreeNode(boolean isLeaf) {
        if (!isLeaf) {
            this.children = new ArrayList<>();
        }
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    @Override
    public int getNumOfKeys() {
        return keys.size();
    }

    @Override
    public void setNumOfKeys(int numOfKeys) {

    }

    @Override
    public boolean isLeaf() {
        return children == null;
    }

    @Override
    public void setLeaf(boolean isLeaf) {
        if (isLeaf) {
            children = null;
        } else {
            children = new ArrayList<>();
        }

    }

    @Override
    public List<K> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<K> keys) {
        this.keys = keys;
    }

    @Override
    public List<V> getValues() {
        return values;
    }

    @Override
    public void setValues(List<V> values) {
        this.values = values;
    }

    @Override
    public List<IBTreeNode<K, V>> getChildren() {
        return children;
    }

    @Override
    public void setChildren(List<IBTreeNode<K, V>> children) {
        this.children = children;
    }
}
