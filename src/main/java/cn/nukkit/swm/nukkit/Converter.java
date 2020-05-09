package cn.nukkit.swm.nukkit;

import cn.nukkit.swm.api.utils.NibbleArray;

public final class Converter {

    public static cn.nukkit.level.format.anvil.util.NibbleArray convertArray(final NibbleArray array) {
        return new cn.nukkit.level.format.anvil.util.NibbleArray(array.getBacking());
    }

    public static NibbleArray convertArray(final cn.nukkit.level.format.anvil.util.NibbleArray array) {
        if (array == null) {
            return null;
        }

        return new NibbleArray(array.getData());
    }

}
