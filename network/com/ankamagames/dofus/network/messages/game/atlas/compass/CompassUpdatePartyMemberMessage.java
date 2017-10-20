// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.atlas.compass;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CompassUpdatePartyMemberMessage
    extends com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdateMessage {
  public static final int PROTOCOL_ID = 5589;
  // vi64
  public long memberId;
  // bool
  public boolean active;

  public CompassUpdatePartyMemberMessage() {}

  public CompassUpdatePartyMemberMessage(
      byte type,
      com.ankamagames.dofus.network.types.game.context.MapCoordinates coords,
      long memberId,
      boolean active) {

    super(type, coords);
    this.memberId = memberId;
    this.active = active;
  }

  @Override
  public int getProtocolId() {
    return 5589;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.memberId);
    writer.write_bool(this.active);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.memberId = reader.read_vi64();
    this.active = reader.read_bool();
  }

  @Override
  public String toString() {

    return "CompassUpdatePartyMemberMessage("
        + "type="
        + this.type
        + ", coords="
        + this.coords
        + ", memberId="
        + this.memberId
        + ", active="
        + this.active
        + ')';
  }
}
