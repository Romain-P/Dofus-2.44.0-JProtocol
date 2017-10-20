// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceModificationEmblemValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6447;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem Alliancemblem;

  public AllianceModificationEmblemValidMessage() {}

  public AllianceModificationEmblemValidMessage(
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem Alliancemblem) {
    this.Alliancemblem = Alliancemblem;
  }

  @Override
  public int getProtocolId() {
    return 6447;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.Alliancemblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.Alliancemblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.Alliancemblem.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AllianceModificationEmblemValidMessage(" + "Alliancemblem=" + this.Alliancemblem + ')';
  }
}
