// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.dungeon;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonKeyRingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6299;
  // array,vi16
  public short[] availables;
  // array,vi16
  public short[] unavailables;

  public DungeonKeyRingMessage()
  {}

  public DungeonKeyRingMessage(short[] availables, short[] unavailables)
  {
    this.availables = availables;
    this.unavailables = unavailables;
  }

  @Override
  public int getProtocolId()
  {
    return 6299;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(availables.length);
    writer.write_array_vi16(this.availables);
    writer.write_ui16(unavailables.length);
    writer.write_array_vi16(this.unavailables);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int availables_length = reader.read_ui16();
    this.availables = reader.read_array_vi16(availables_length);

    int unavailables_length = reader.read_ui16();
    this.unavailables = reader.read_array_vi16(unavailables_length);
  }

  @Override
  public String toString()
  {

    return "DungeonKeyRingMessage("
        + "availables="
        + java.util.Arrays.toString(this.availables)
        + ", unavailables="
        + java.util.Arrays.toString(this.unavailables)
        + ')';
  }
}
