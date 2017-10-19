// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterInventoryMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6350;
  // array,com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure
  public com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure[] figures;

  public KrosmasterInventoryMessage()
  {}

  public KrosmasterInventoryMessage(
      com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure[] figures)
  {
    this.figures = figures;
  }

  public KrosmasterInventoryMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure>
          figures)
  {
    this.figures =
        figures.toArray(com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6350;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(figures.length);

    for (int i = 0; i < figures.length; i++)
  {

      figures[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int figures_length = reader.read_ui16();
    this.figures =
        new com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure[figures_length];

    for (int i = 0; i < figures_length; i++)
  {

      com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure figures_it =
          new com.ankamagames.dofus.network.types.web.krosmaster.KrosmasterFigure();

      figures_it.deserialize(reader);
      this.figures[i] = figures_it;
    }
  }

  @Override
  public String toString()
  {

    return "KrosmasterInventoryMessage("
        + "figures="
        + java.util.Arrays.toString(this.figures)
        + ')';
  }
}
