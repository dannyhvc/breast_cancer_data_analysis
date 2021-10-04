package bcds.dataStructs;

/**
 *
 */
public class BCClassifier {
    public BstNode<Pair<Float, BCEnum>> Root;

    public BCClassifier() {
        // breath first initialization in order left to right
        Root = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.UNIFORM_CELL_SHAPE)
        );

        // layer 2
        Root.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.UNIFORM_CELL_SIZE)
        );
        Root.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BARE_NUCLEI)
        );

        // layer 3
        Root.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.BLAND_CHROMATIN)
        );
        Root.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BARE_NUCLEI)
        );
        Root.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(4.0f), BCEnum.UNIFORM_CELL_SIZE)
        );

        // layer 4
        Root.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(4.0f), BCEnum.UNIFORM_CELL_SIZE)
        );
        Root.R.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.UNIFORM_CELL_SIZE)
        );
        Root.R.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.UNIFORM_CELL_SIZE)
        );
        Root.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(5.0f), BCEnum.BARE_NUCLEI)
        );
        Root.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BARE_NUCLEI)
        );

        // layer 5
        Root.L.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(7.0f), BCEnum.BARE_NUCLEI)
        );
        Root.L.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(8.9f), BCEnum.MITOSIS)
        );
        Root.R.L.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(4.0f), BCEnum.SINGLE_EPITHILIAL_SIZE)
        );
        Root.R.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BARE_NUCLEI)
        );
        Root.R.R.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.NORMAL_NUCLEOLI)
        );
        Root.R.R.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(4.0f), BCEnum.MARGINAL_ADHESION)
        );
        Root.R.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.MARGINAL_ADHESION)
        );

        // layer 6
        Root.L.R.R.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(6.0f), BCEnum.SINGLE_EPITHILIAL_SIZE)
        );
        Root.L.R.R.R.L  = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.MARGINAL_ADHESION)
        );
        Root.L.R.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.MARGINAL_ADHESION)
        );
        Root.R.L.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BARE_NUCLEI)
        );
        Root.R.L.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.UNIFORM_CELL_SHAPE)
        );
        Root.R.L.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(3.0f), BCEnum.MARGINAL_ADHESION)
        );
        Root.R.R.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(5.0f), BCEnum.MARGINAL_ADHESION)
        );
        Root.R.R.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.BLAND_CHROMATIN)
        );

        // layer 7
        Root.L.R.R.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.R.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.R.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.L.R.R.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.L.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.L.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.R.R.L.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.L.R.R.L.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.L.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.L.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.L.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.R.R.R.L = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(-1.0f), BCEnum.DIAGNOSIS)
        );
        Root.R.R.R.R.R.R = new BstNode<Pair<Float, BCEnum>>(
            new Pair<>(Float.valueOf(1.0f), BCEnum.DIAGNOSIS)
        );
    }

    public boolean diagnose(Integer[] feature) {
        BstNode<Pair<Float, BCEnum>> current = Root;
        return this.step(feature, current);
    }

    private boolean step(Integer[] feature, BstNode<Pair<Float, BCEnum>> current) {
        if (current.key.second.equals(BCEnum.DIAGNOSIS)) {
            if (current.key.first.intValue() == -1)
                return false;
            else
                return true;
        }
        else {
            if (feature[BCEnum.getIndexOfBCEnum(current.key.second)] <= current.key.first) {
                return this.step(feature, current.L);
            } else {
                return this.step(feature, current.R);
            }
        }
    }
}
