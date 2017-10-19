// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightJoinMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 702;
  // flag,_loc2_,0
  public boolean isTeamPhase;
  // flag,_loc2_,1
  public boolean canBeCancelled;
  // flag,_loc2_,2
  public boolean canSayReady;
  // flag,_loc2_,3
  public boolean isFightStarted;
  // i16
  public short timeMaxBeforeFightStart;
  // i8
  public byte fightType;

  public GameFightJoinMessage()
  {}

  public GameFightJoinMessage(
      boolean isTeamPhase,
      boolean canBeCancelled,
      boolean canSayReady,
      boolean isFightStarted,
      short timeMaxBeforeFightStart,
      byte fightType)
  {
    this.isTeamPhase = isTeamPhase;
    this.canBeCancelled = canBeCancelled;
    this.canSayReady = canSayReady;
    this.isFightStarted = isFightStarted;
    this.timeMaxBeforeFightStart = timeMaxBeforeFightStart;
    this.fightType = fightType;
  }

  @Override
  public int getProtocolId()
  {
    return 702;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isTeamPhase, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canBeCancelled, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canSayReady, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isFightStarted, 3);
    writer.write_i8(_loc2_);
    writer.write_i16(this.timeMaxBeforeFightStart);
    writer.write_i8(this.fightType);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.isTeamPhase = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.canBeCancelled = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.canSayReady = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.isFightStarted = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.timeMaxBeforeFightStart = reader.read_i16();
    this.fightType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameFightJoinMessage("
        + "isTeamPhase="
        + this.isTeamPhase
        + ", canBeCancelled="
        + this.canBeCancelled
        + ", canSayReady="
        + this.canSayReady
        + ", isFightStarted="
        + this.isFightStarted
        + ", timeMaxBeforeFightStart="
        + this.timeMaxBeforeFightStart
        + ", fightType="
        + this.fightType
        + ')';
  }
}
