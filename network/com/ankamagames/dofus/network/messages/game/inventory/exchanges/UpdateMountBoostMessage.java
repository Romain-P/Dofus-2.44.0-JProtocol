// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateMountBoostMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6179;
  // vi32
  public int rideId;
  // array,com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost
  public com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost[] boostToUpdateList;

  public UpdateMountBoostMessage() {}

  public UpdateMountBoostMessage(
      int rideId,
      com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost[] boostToUpdateList) {
    this.rideId = rideId;
    this.boostToUpdateList = boostToUpdateList;
  }

  public UpdateMountBoostMessage(
      int rideId,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost>
          boostToUpdateList) {
    this.rideId = rideId;
    this.boostToUpdateList =
        boostToUpdateList.toArray(
            com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6179;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.rideId);
    writer.write_ui16(boostToUpdateList.length);

    for (int i = 0; i < boostToUpdateList.length; i++) {

      writer.write_ui16(boostToUpdateList[i].getProtocolId());

      boostToUpdateList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.rideId = reader.read_vi32();

    int boostToUpdateList_length = reader.read_ui16();
    this.boostToUpdateList =
        new com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost
            [boostToUpdateList_length];

    for (int i = 0; i < boostToUpdateList_length; i++) {

      int boostToUpdateList_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost boostToUpdateList_it =
          (com.ankamagames.dofus.network.types.game.mount.UpdateMountBoost)
              InternalProtocolTypeManager.get(boostToUpdateList_it_typeId);

      boostToUpdateList_it.deserialize(reader);
      this.boostToUpdateList[i] = boostToUpdateList_it;
    }
  }

  @Override
  public String toString() {

    return "UpdateMountBoostMessage("
        + "rideId="
        + this.rideId
        + ", boostToUpdateList="
        + java.util.Arrays.toString(this.boostToUpdateList)
        + ')';
  }
}
