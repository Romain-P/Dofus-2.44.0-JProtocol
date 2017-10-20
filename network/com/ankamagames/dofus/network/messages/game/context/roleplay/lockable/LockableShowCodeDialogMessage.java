// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableShowCodeDialogMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5740;
  // bool
  public boolean changeOrUse;
  // i8
  public byte codeSize;

  public LockableShowCodeDialogMessage() {}

  public LockableShowCodeDialogMessage(boolean changeOrUse, byte codeSize) {
    this.changeOrUse = changeOrUse;
    this.codeSize = codeSize;
  }

  @Override
  public int getProtocolId() {
    return 5740;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.changeOrUse);
    writer.write_i8(this.codeSize);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.changeOrUse = reader.read_bool();
    this.codeSize = reader.read_i8();
  }

  @Override
  public String toString() {

    return "LockableShowCodeDialogMessage("
        + "changeOrUse="
        + this.changeOrUse
        + ", codeSize="
        + this.codeSize
        + ')';
  }
}
