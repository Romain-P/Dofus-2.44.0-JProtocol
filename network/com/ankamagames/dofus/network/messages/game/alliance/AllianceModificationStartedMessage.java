// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceModificationStartedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6444;
  // flag,_loc2_,0
  public boolean canChangeName;
  // flag,_loc2_,1
  public boolean canChangeTag;
  // flag,_loc2_,2
  public boolean canChangeEmblem;

  public AllianceModificationStartedMessage()
  {}

  public AllianceModificationStartedMessage(
      boolean canChangeName, boolean canChangeTag, boolean canChangeEmblem)
  {
    this.canChangeName = canChangeName;
    this.canChangeTag = canChangeTag;
    this.canChangeEmblem = canChangeEmblem;
  }

  @Override
  public int getProtocolId()
  {
    return 6444;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canChangeName, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canChangeTag, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canChangeEmblem, 2);
    writer.write_i8(_loc2_);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.canChangeName = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.canChangeTag = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.canChangeEmblem = BooleanByteWrapper.getFlag(_loc2_, 2);
  }

  @Override
  public String toString()
  {

    return "AllianceModificationStartedMessage("
        + "canChangeName="
        + this.canChangeName
        + ", canChangeTag="
        + this.canChangeTag
        + ", canChangeEmblem="
        + this.canChangeEmblem
        + ')';
  }
}
