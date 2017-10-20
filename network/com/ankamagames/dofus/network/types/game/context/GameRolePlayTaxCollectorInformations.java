// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayTaxCollectorInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayActorInformations {
  public static final int PROTOCOL_ID = 148;
  // com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations
  public com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations
      identification;
  // ui8
  public short guildLevel;
  // i32
  public int taxCollectorAttack;

  public GameRolePlayTaxCollectorInformations() {}

  public GameRolePlayTaxCollectorInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations
          identification,
      short guildLevel,
      int taxCollectorAttack) {

    super(contextualId, look, disposition);
    this.identification = identification;
    this.guildLevel = guildLevel;
    this.taxCollectorAttack = taxCollectorAttack;
  }

  @Override
  public int getProtocolId() {
    return 148;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.identification.getProtocolId());
    this.identification.serialize(writer);
    writer.write_ui8(this.guildLevel);
    writer.write_i32(this.taxCollectorAttack);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int identification_typeId = reader.read_ui16();
    this.identification =
        (com.ankamagames.dofus.network.types.game.context.TaxCollectorStaticInformations)
            InternalProtocolTypeManager.get(identification_typeId);
    this.identification.deserialize(reader);
    this.guildLevel = reader.read_ui8();
    this.taxCollectorAttack = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GameRolePlayTaxCollectorInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", identification="
        + this.identification
        + ", guildLevel="
        + this.guildLevel
        + ", taxCollectorAttack="
        + this.taxCollectorAttack
        + ')';
  }
}
