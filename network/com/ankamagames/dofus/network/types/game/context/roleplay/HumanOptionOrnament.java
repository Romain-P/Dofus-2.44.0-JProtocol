// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionOrnament
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 411;
  // vi16
  public short ornamentId;

  public HumanOptionOrnament()
  {}

  public HumanOptionOrnament(short ornamentId)
  {

    super();
    this.ornamentId = ornamentId;
  }

  @Override
  public int getProtocolId()
  {
    return 411;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.ornamentId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.ornamentId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "HumanOptionOrnament(" + "ornamentId=" + this.ornamentId + ')';
  }
}
