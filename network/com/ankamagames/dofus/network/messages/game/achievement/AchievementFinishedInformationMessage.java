// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementFinishedInformationMessage
    extends com.ankamagames.dofus.network.messages.game.achievement.AchievementFinishedMessage {
  public static final int PROTOCOL_ID = 6381;
  // str
  public java.lang.String name;
  // ui64
  public java.math.BigInteger playerId;

  public AchievementFinishedInformationMessage()
  {}

  public AchievementFinishedInformationMessage(
      short id, short finishedlevel, java.lang.String name, java.math.BigInteger playerId)
  {

    super(id, finishedlevel);
    this.name = name;
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6381;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.name);
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.name = reader.read_str();
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "AchievementFinishedInformationMessage("
        + "id="
        + this.id
        + ", finishedlevel="
        + this.finishedlevel
        + ", name="
        + this.name
        + ", playerId="
        + this.playerId
        + ')';
  }
}
