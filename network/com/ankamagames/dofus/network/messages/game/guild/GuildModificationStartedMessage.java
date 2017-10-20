// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildModificationStartedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6324;
  // flag,_loc2_,0
  public boolean canChangeName;
  // flag,_loc2_,1
  public boolean canChangeEmblem;

  public GuildModificationStartedMessage() {}

  public GuildModificationStartedMessage(boolean canChangeName, boolean canChangeEmblem) {
    this.canChangeName = canChangeName;
    this.canChangeEmblem = canChangeEmblem;
  }

  @Override
  public int getProtocolId() {
    return 6324;
  }

  @Override
  public void serialize(DataWriter writer) {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canChangeName, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canChangeEmblem, 1);
    writer.write_i8(_loc2_);
  }

  @Override
  public void deserialize(DataReader reader) {

    int _loc2_ = reader.read_i8();
    this.canChangeName = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.canChangeEmblem = BooleanByteWrapper.getFlag(_loc2_, 1);
  }

  @Override
  public String toString() {

    return "GuildModificationStartedMessage("
        + "canChangeName="
        + this.canChangeName
        + ", canChangeEmblem="
        + this.canChangeEmblem
        + ')';
  }
}
