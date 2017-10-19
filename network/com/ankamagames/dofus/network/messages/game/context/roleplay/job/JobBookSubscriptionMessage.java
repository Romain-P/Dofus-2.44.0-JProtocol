// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobBookSubscriptionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6593;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription[]
      subscriptions;

  public JobBookSubscriptionMessage()
  {}

  public JobBookSubscriptionMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription[]
          subscriptions)
  {
    this.subscriptions = subscriptions;
  }

  public JobBookSubscriptionMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription>
          subscriptions)
  {
    this.subscriptions =
        subscriptions.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6593;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(subscriptions.length);

    for (int i = 0; i < subscriptions.length; i++)
  {

      subscriptions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int subscriptions_length = reader.read_ui16();
    this.subscriptions =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription
            [subscriptions_length];

    for (int i = 0; i < subscriptions_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobBookSubscription
          subscriptions_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job
                  .JobBookSubscription();

      subscriptions_it.deserialize(reader);
      this.subscriptions[i] = subscriptions_it;
    }
  }

  @Override
  public String toString()
  {

    return "JobBookSubscriptionMessage("
        + "subscriptions="
        + java.util.Arrays.toString(this.subscriptions)
        + ')';
  }
}
