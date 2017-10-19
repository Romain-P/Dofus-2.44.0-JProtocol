// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveUsedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5745;
  // ui64
  public java.math.BigInteger entityId;
  // vi32
  public int elemId;
  // vi16
  public short skillId;
  // vi16
  public short duration;
  // bool
  public boolean canMove;

  public InteractiveUsedMessage()
  {}

  public InteractiveUsedMessage(
      java.math.BigInteger entityId, int elemId, short skillId, short duration, boolean canMove)
  {
    this.entityId = entityId;
    this.elemId = elemId;
    this.skillId = skillId;
    this.duration = duration;
    this.canMove = canMove;
  }

  @Override
  public int getProtocolId()
  {
    return 5745;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.entityId);
    writer.write_vi32(this.elemId);
    writer.write_vi16(this.skillId);
    writer.write_vi16(this.duration);
    writer.write_bool(this.canMove);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.entityId = reader.read_ui64();
    this.elemId = reader.read_vi32();
    this.skillId = reader.read_vi16();
    this.duration = reader.read_vi16();
    this.canMove = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "InteractiveUsedMessage("
        + "entityId="
        + this.entityId
        + ", elemId="
        + this.elemId
        + ", skillId="
        + this.skillId
        + ", duration="
        + this.duration
        + ", canMove="
        + this.canMove
        + ')';
  }
}
