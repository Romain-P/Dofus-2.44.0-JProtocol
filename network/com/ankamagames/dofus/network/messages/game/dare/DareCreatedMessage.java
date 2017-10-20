// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareCreatedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6668;
  // com.ankamagames.dofus.network.types.game.dare.DareInformations
  public com.ankamagames.dofus.network.types.game.dare.DareInformations dareInfos;
  // bool
  public boolean needNotifications;

  public DareCreatedMessage() {}

  public DareCreatedMessage(
      com.ankamagames.dofus.network.types.game.dare.DareInformations dareInfos,
      boolean needNotifications) {
    this.dareInfos = dareInfos;
    this.needNotifications = needNotifications;
  }

  @Override
  public int getProtocolId() {
    return 6668;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.dareInfos.serialize(writer);
    writer.write_bool(this.needNotifications);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dareInfos = new com.ankamagames.dofus.network.types.game.dare.DareInformations();
    this.dareInfos.deserialize(reader);
    this.needNotifications = reader.read_bool();
  }

  @Override
  public String toString() {

    return "DareCreatedMessage("
        + "dareInfos="
        + this.dareInfos
        + ", needNotifications="
        + this.needNotifications
        + ')';
  }
}
