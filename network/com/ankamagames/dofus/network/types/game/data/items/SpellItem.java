// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellItem extends com.ankamagames.dofus.network.types.game.data.items.Item {
  public static final int PROTOCOL_ID = 49;
  // i32
  public int spellId;
  // i16
  public short spellLevel;

  public SpellItem()
  {}

  public SpellItem(int spellId, short spellLevel)
  {

    super();
    this.spellId = spellId;
    this.spellLevel = spellLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 49;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.spellId);
    writer.write_i16(this.spellLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.spellId = reader.read_i32();
    this.spellLevel = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "SpellItem(" + "spellId=" + this.spellId + ", spellLevel=" + this.spellLevel + ')';
  }
}
