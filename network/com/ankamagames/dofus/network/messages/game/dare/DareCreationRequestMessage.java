// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareCreationRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6665;
  // flag,_loc2_,0
  public boolean isPrivate;
  // flag,_loc2_,1
  public boolean isForGuild;
  // flag,_loc2_,2
  public boolean isForAlliance;
  // flag,_loc2_,3
  public boolean needNotifications;
  // ui64
  public java.math.BigInteger subscriptionFee;
  // ui64
  public java.math.BigInteger jackpot;
  // ui16
  public int maxCountWinners;
  // ui32
  public long delayBeforeStart;
  // ui32
  public long duration;
  // array,com.ankamagames.dofus.network.types.game.dare.DareCriteria
  public com.ankamagames.dofus.network.types.game.dare.DareCriteria[] criterions;

  public DareCreationRequestMessage()
  {}

  public DareCreationRequestMessage(
      boolean isPrivate,
      boolean isForGuild,
      boolean isForAlliance,
      boolean needNotifications,
      java.math.BigInteger subscriptionFee,
      java.math.BigInteger jackpot,
      int maxCountWinners,
      long delayBeforeStart,
      long duration,
      com.ankamagames.dofus.network.types.game.dare.DareCriteria[] criterions)
  {
    this.isPrivate = isPrivate;
    this.isForGuild = isForGuild;
    this.isForAlliance = isForAlliance;
    this.needNotifications = needNotifications;
    this.subscriptionFee = subscriptionFee;
    this.jackpot = jackpot;
    this.maxCountWinners = maxCountWinners;
    this.delayBeforeStart = delayBeforeStart;
    this.duration = duration;
    this.criterions = criterions;
  }

  public DareCreationRequestMessage(
      boolean isPrivate,
      boolean isForGuild,
      boolean isForAlliance,
      boolean needNotifications,
      java.math.BigInteger subscriptionFee,
      java.math.BigInteger jackpot,
      int maxCountWinners,
      long delayBeforeStart,
      long duration,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.dare.DareCriteria>
          criterions)
  {
    this.isPrivate = isPrivate;
    this.isForGuild = isForGuild;
    this.isForAlliance = isForAlliance;
    this.needNotifications = needNotifications;
    this.subscriptionFee = subscriptionFee;
    this.jackpot = jackpot;
    this.maxCountWinners = maxCountWinners;
    this.delayBeforeStart = delayBeforeStart;
    this.duration = duration;
    this.criterions =
        criterions.toArray(com.ankamagames.dofus.network.types.game.dare.DareCriteria[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6665;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isPrivate, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isForGuild, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isForAlliance, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.needNotifications, 3);
    writer.write_i8(_loc2_);
    writer.write_ui64(this.subscriptionFee);
    writer.write_ui64(this.jackpot);
    writer.write_ui16(this.maxCountWinners);
    writer.write_ui32(this.delayBeforeStart);
    writer.write_ui32(this.duration);
    writer.write_ui16(criterions.length);

    for (int i = 0; i < criterions.length; i++)
  {

      criterions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.isPrivate = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.isForGuild = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.isForAlliance = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.needNotifications = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.subscriptionFee = reader.read_ui64();
    this.jackpot = reader.read_ui64();
    this.maxCountWinners = reader.read_ui16();
    this.delayBeforeStart = reader.read_ui32();
    this.duration = reader.read_ui32();

    int criterions_length = reader.read_ui16();
    this.criterions =
        new com.ankamagames.dofus.network.types.game.dare.DareCriteria[criterions_length];

    for (int i = 0; i < criterions_length; i++)
  {

      com.ankamagames.dofus.network.types.game.dare.DareCriteria criterions_it =
          new com.ankamagames.dofus.network.types.game.dare.DareCriteria();

      criterions_it.deserialize(reader);
      this.criterions[i] = criterions_it;
    }
  }

  @Override
  public String toString()
  {

    return "DareCreationRequestMessage("
        + "isPrivate="
        + this.isPrivate
        + ", isForGuild="
        + this.isForGuild
        + ", isForAlliance="
        + this.isForAlliance
        + ", needNotifications="
        + this.needNotifications
        + ", subscriptionFee="
        + this.subscriptionFee
        + ", jackpot="
        + this.jackpot
        + ", maxCountWinners="
        + this.maxCountWinners
        + ", delayBeforeStart="
        + this.delayBeforeStart
        + ", duration="
        + this.duration
        + ", criterions="
        + java.util.Arrays.toString(this.criterions)
        + ')';
  }
}
