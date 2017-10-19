// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.spells;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1200;
  // bool
  public boolean spellPrevisualization;
  // array,com.ankamagames.dofus.network.types.game.data.items.SpellItem
  public com.ankamagames.dofus.network.types.game.data.items.SpellItem[] spells;

  public SpellListMessage()
  {}

  public SpellListMessage(
      boolean spellPrevisualization,
      com.ankamagames.dofus.network.types.game.data.items.SpellItem[] spells)
  {
    this.spellPrevisualization = spellPrevisualization;
    this.spells = spells;
  }

  public SpellListMessage(
      boolean spellPrevisualization,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.SpellItem>
          spells)
  {
    this.spellPrevisualization = spellPrevisualization;
    this.spells =
        spells.toArray(com.ankamagames.dofus.network.types.game.data.items.SpellItem[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 1200;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.spellPrevisualization);
    writer.write_ui16(spells.length);

    for (int i = 0; i < spells.length; i++)
  {

      spells[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.spellPrevisualization = reader.read_bool();

    int spells_length = reader.read_ui16();
    this.spells = new com.ankamagames.dofus.network.types.game.data.items.SpellItem[spells_length];

    for (int i = 0; i < spells_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.SpellItem spells_it =
          new com.ankamagames.dofus.network.types.game.data.items.SpellItem();

      spells_it.deserialize(reader);
      this.spells[i] = spells_it;
    }
  }

  @Override
  public String toString()
  {

    return "SpellListMessage("
        + "spellPrevisualization="
        + this.spellPrevisualization
        + ", spells="
        + java.util.Arrays.toString(this.spells)
        + ')';
  }
}
