// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorDialogQuestionBasicMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5619;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo;

  public TaxCollectorDialogQuestionBasicMessage() {}

  public TaxCollectorDialogQuestionBasicMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo) {
    this.guildInfo = guildInfo;
  }

  @Override
  public int getProtocolId() {
    return 5619;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.guildInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guildInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "TaxCollectorDialogQuestionBasicMessage(" + "guildInfo=" + this.guildInfo + ')';
  }
}
