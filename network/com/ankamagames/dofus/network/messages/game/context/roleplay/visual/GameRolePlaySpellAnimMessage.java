// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.visual;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlaySpellAnimMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6114;
  // ui64
  public java.math.BigInteger casterId;
  // vi16
  public short targetCellId;
  // vi16
  public short spellId;
  // i16
  public short spellLevel;

  public GameRolePlaySpellAnimMessage()
  {}

  public GameRolePlaySpellAnimMessage(
      java.math.BigInteger casterId, short targetCellId, short spellId, short spellLevel)
  {
    this.casterId = casterId;
    this.targetCellId = targetCellId;
    this.spellId = spellId;
    this.spellLevel = spellLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 6114;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.casterId);
    writer.write_vi16(this.targetCellId);
    writer.write_vi16(this.spellId);
    writer.write_i16(this.spellLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.casterId = reader.read_ui64();
    this.targetCellId = reader.read_vi16();
    this.spellId = reader.read_vi16();
    this.spellLevel = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "GameRolePlaySpellAnimMessage("
        + "casterId="
        + this.casterId
        + ", targetCellId="
        + this.targetCellId
        + ", spellId="
        + this.spellId
        + ", spellLevel="
        + this.spellLevel
        + ')';
  }
}
