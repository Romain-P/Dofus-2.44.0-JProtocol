// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorMovementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5633;
  // i8
  public byte movementType;
  // com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations
  public com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations
      basicInfos;
  // ui64
  public java.math.BigInteger playerId;
  // str
  public java.lang.String playerName;

  public TaxCollectorMovementMessage()
  {}

  public TaxCollectorMovementMessage(
      byte movementType,
      com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations basicInfos,
      java.math.BigInteger playerId,
      java.lang.String playerName)
  {
    this.movementType = movementType;
    this.basicInfos = basicInfos;
    this.playerId = playerId;
    this.playerName = playerName;
  }

  @Override
  public int getProtocolId()
  {
    return 5633;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.movementType);
    this.basicInfos.serialize(writer);
    writer.write_ui64(this.playerId);
    writer.write_str(this.playerName);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.movementType = reader.read_i8();
    this.basicInfos =
        new com.ankamagames.dofus.network.types.game.guild.tax.TaxCollectorBasicInformations();
    this.basicInfos.deserialize(reader);
    this.playerId = reader.read_ui64();
    this.playerName = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "TaxCollectorMovementMessage("
        + "movementType="
        + this.movementType
        + ", basicInfos="
        + this.basicInfos
        + ", playerId="
        + this.playerId
        + ", playerName="
        + this.playerName
        + ')';
  }
}
