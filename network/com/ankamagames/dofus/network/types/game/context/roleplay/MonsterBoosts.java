// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MonsterBoosts extends NetworkType {
  public static final int PROTOCOL_ID = 497;
  // vi32
  public int id;
  // vi16
  public short xpBoost;
  // vi16
  public short dropBoost;

  public MonsterBoosts()
  {}

  public MonsterBoosts(int id, short xpBoost, short dropBoost)
  {
    this.id = id;
    this.xpBoost = xpBoost;
    this.dropBoost = dropBoost;
  }

  @Override
  public int getProtocolId()
  {
    return 497;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.id);
    writer.write_vi16(this.xpBoost);
    writer.write_vi16(this.dropBoost);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi32();
    this.xpBoost = reader.read_vi16();
    this.dropBoost = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "MonsterBoosts("
        + "id="
        + this.id
        + ", xpBoost="
        + this.xpBoost
        + ", dropBoost="
        + this.dropBoost
        + ')';
  }
}
