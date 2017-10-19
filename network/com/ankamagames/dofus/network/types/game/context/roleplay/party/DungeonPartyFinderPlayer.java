// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderPlayer extends NetworkType {
  public static final int PROTOCOL_ID = 373;
  // ui64
  public java.math.BigInteger playerId;
  // str
  public java.lang.String playerName;
  // i8
  public byte breed;
  // bool
  public boolean sex;
  // ui8
  public short level;

  public DungeonPartyFinderPlayer()
  {}

  public DungeonPartyFinderPlayer(
      java.math.BigInteger playerId,
      java.lang.String playerName,
      byte breed,
      boolean sex,
      short level)
  {
    this.playerId = playerId;
    this.playerName = playerName;
    this.breed = breed;
    this.sex = sex;
    this.level = level;
  }

  @Override
  public int getProtocolId()
  {
    return 373;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.playerId);
    writer.write_str(this.playerName);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
    writer.write_ui8(this.level);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerId = reader.read_ui64();
    this.playerName = reader.read_str();
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();
    this.level = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "DungeonPartyFinderPlayer("
        + "playerId="
        + this.playerId
        + ", playerName="
        + this.playerName
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", level="
        + this.level
        + ')';
  }
}
