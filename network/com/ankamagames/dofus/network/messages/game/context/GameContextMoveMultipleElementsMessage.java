// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextMoveMultipleElementsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 254;
  // array,com.ankamagames.dofus.network.types.game.context.EntityMovementInformations
  public com.ankamagames.dofus.network.types.game.context.EntityMovementInformations[] movements;

  public GameContextMoveMultipleElementsMessage()
  {}

  public GameContextMoveMultipleElementsMessage(
      com.ankamagames.dofus.network.types.game.context.EntityMovementInformations[] movements)
  {
    this.movements = movements;
  }

  public GameContextMoveMultipleElementsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.EntityMovementInformations>
          movements)
  {
    this.movements =
        movements.toArray(
            com.ankamagames.dofus.network.types.game.context.EntityMovementInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 254;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(movements.length);

    for (int i = 0; i < movements.length; i++)
  {

      movements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int movements_length = reader.read_ui16();
    this.movements =
        new com.ankamagames.dofus.network.types.game.context.EntityMovementInformations
            [movements_length];

    for (int i = 0; i < movements_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.EntityMovementInformations movements_it =
          new com.ankamagames.dofus.network.types.game.context.EntityMovementInformations();

      movements_it.deserialize(reader);
      this.movements[i] = movements_it;
    }
  }

  @Override
  public String toString()
  {

    return "GameContextMoveMultipleElementsMessage("
        + "movements="
        + java.util.Arrays.toString(this.movements)
        + ')';
  }
}
