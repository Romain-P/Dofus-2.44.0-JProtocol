// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dialog;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PauseDialogMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6012;
  // i8
  public byte dialogType;

  public PauseDialogMessage()
  {}

  public PauseDialogMessage(byte dialogType)
  {
    this.dialogType = dialogType;
  }

  @Override
  public int getProtocolId()
  {
    return 6012;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.dialogType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dialogType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "PauseDialogMessage(" + "dialogType=" + this.dialogType + ')';
  }
}
