/*
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info
 *
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.blocks.tracks;

import mods.railcraft.common.blocks.tracks.speedcontroller.SpeedControllerHighSpeed;
import net.minecraft.entity.item.EntityMinecart;

public class TrackSpeedWye extends TrackWye {

    public TrackSpeedWye() {
        speedController = SpeedControllerHighSpeed.getInstance();
    }

    @Override
    public void onMinecartPass(EntityMinecart cart) {
        TrackSpeed.testCartSpeedForBasic(this, cart);
    }

    @Override
    public EnumTrack getTrackType() {
        return EnumTrack.SPEED_WYE;
    }
}
