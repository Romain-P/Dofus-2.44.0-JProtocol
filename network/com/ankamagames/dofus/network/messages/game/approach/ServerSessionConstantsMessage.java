// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSessionConstantsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6434;
  // array,com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant
  public com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant[] variables;

  public ServerSessionConstantsMessage()
  {}

  public ServerSessionConstantsMessage(
      com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant[] variables)
  {
    this.variables = variables;
  }

  public ServerSessionConstantsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant>
          variables)
  {
    this.variables =
        variables.toArray(
            com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6434;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(variables.length);

    for (int i = 0; i < variables.length; i++)
  {

      writer.write_ui16(variables[i].getProtocolId());

      variables[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int variables_length = reader.read_ui16();
    this.variables =
        new com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant
            [variables_length];

    for (int i = 0; i < variables_length; i++)
  {

      int variables_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant variables_it =
          (com.ankamagames.dofus.network.types.game.approach.ServerSessionConstant)
              InternalProtocolTypeManager.get(variables_it_typeId);

      variables_it.deserialize(reader);
      this.variables[i] = variables_it;
    }
  }

  @Override
  public String toString()
  {

    return "ServerSessionConstantsMessage("
        + "variables="
        + java.util.Arrays.toString(this.variables)
        + ')';
  }
}
