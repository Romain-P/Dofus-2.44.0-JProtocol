// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightTakePlaceRequestMessage
    extends com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightJoinRequestMessage {
  public static final int PROTOCOL_ID = 6235;
  // i32
  public int replacedCharacterId;

  public GuildFightTakePlaceRequestMessage() {}

  public GuildFightTakePlaceRequestMessage(double taxCollectorId, int replacedCharacterId) {

    super(taxCollectorId);
    this.replacedCharacterId = replacedCharacterId;
  }

  @Override
  public int getProtocolId() {
    return 6235;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.replacedCharacterId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.replacedCharacterId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GuildFightTakePlaceRequestMessage("
        + "taxCollectorId="
        + this.taxCollectorId
        + ", replacedCharacterId="
        + this.replacedCharacterId
        + ')';
  }
}
