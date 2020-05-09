package cn.nukkit.swm.common;

import cn.nukkit.level.Level;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.swm.api.world.SlimeWorld;

public interface SlimeNMS {

    void setDefaultWorlds(SlimeWorld normalWorld, SlimeWorld netherWorld, SlimeWorld endWorld);

    void generateWorld(SlimeWorld world);

    default Object createNMSWorld(final SlimeWorld world) {
        throw new UnsupportedOperationException("This spigot version does not support async world loading");
    }

    default void addWorldToServerList(final Object worldObject) {
        throw new UnsupportedOperationException("This spigot version does not support async world loading");
    }

    SlimeWorld getSlimeWorld(Level level);

    byte getWorldVersion();

    default CompoundTag convertChunk(final CompoundTag chunkTag) {
        return chunkTag;
    }

}
