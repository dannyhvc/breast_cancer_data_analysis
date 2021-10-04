package bcds.dataStructs;

/**
 * Node for the binary search tree used in classifier
 */
public class BstNode<T> {
    public T key;
    BstNode<T> L, R;

    public BstNode(T value) {
        key = value;
        L = R = null;
    }
}
