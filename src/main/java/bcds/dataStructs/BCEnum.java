package bcds.dataStructs;

import java.util.Arrays;

public enum BCEnum {
    ID,
    CLUMP_THICKNESS,
    UNIFORM_CELL_SIZE,
    UNIFORM_CELL_SHAPE,
    MARGINAL_ADHESION,
    SINGLE_EPITHILIAL_SIZE,
    BARE_NUCLEI,
    BLAND_CHROMATIN,
    NORMAL_NUCLEOLI,
    MITOSIS,
    DIAGNOSIS;

    private static BCEnum[] _list = BCEnum.values();

    public static BCEnum getBcEnumAt(final int index) {
        return _list[index];
    }

    public static int getIndexOfBCEnum(final BCEnum val) {
        return Arrays.asList(_list).indexOf(val);
    }

    public static int listGetLastIndex() {
        return _list.length;
    }
}
