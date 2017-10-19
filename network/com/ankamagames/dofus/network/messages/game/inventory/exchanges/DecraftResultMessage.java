// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DecraftResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6569;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo[]
      results;

  public DecraftResultMessage()
  {}

  public DecraftResultMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo[]
          results)
  {
    this.results = results;
  }

  public DecraftResultMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo>
          results)
  {
    this.results =
        results.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6569;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(results.length);

    for (int i = 0; i < results.length; i++)
  {

      results[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int results_length = reader.read_ui16();
    this.results =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo
            [results_length];

    for (int i = 0; i < results_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.DecraftedItemStackInfo
          results_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .DecraftedItemStackInfo();

      results_it.deserialize(reader);
      this.results[i] = results_it;
    }
  }

  @Override
  public String toString()
  {

    return "DecraftResultMessage(" + "results=" + java.util.Arrays.toString(this.results) + ')';
  }
}
