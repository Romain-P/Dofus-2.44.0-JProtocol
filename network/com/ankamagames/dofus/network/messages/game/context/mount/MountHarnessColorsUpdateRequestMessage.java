// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountHarnessColorsUpdateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6697;
  // bool
  public boolean useHarnessColors;

  public MountHarnessColorsUpdateRequestMessage()
  {}

  public MountHarnessColorsUpdateRequestMessage(boolean useHarnessColors)
  {
    this.useHarnessColors = useHarnessColors;
  }

  @Override
  public int getProtocolId()
  {
    return 6697;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.useHarnessColors);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.useHarnessColors = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "MountHarnessColorsUpdateRequestMessage("
        + "useHarnessColors="
        + this.useHarnessColors
        + ')';
  }
}
