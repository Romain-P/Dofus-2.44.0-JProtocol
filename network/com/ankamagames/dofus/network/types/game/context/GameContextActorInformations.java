// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextActorInformations extends NetworkType {
  public static final int PROTOCOL_ID = 150;
  // f64
  public double contextualId;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;
  // com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations
  public com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition;

  public GameContextActorInformations()
  {}

  public GameContextActorInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition)
  {
    this.contextualId = contextualId;
    this.look = look;
    this.disposition = disposition;
  }

  @Override
  public int getProtocolId()
  {
    return 150;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.contextualId);
    this.look.serialize(writer);
    writer.write_ui16(this.disposition.getProtocolId());
    this.disposition.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.contextualId = reader.read_f64();
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);

    int disposition_typeId = reader.read_ui16();
    this.disposition =
        (com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations)
            InternalProtocolTypeManager.get(disposition_typeId);
    this.disposition.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameContextActorInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ')';
  }
}
