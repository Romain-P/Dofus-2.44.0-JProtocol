// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractCharacterInformation extends NetworkType {
  public static final int PROTOCOL_ID = 400;
  // ui64
  public java.math.BigInteger id;

  public AbstractCharacterInformation()
  {}

  public AbstractCharacterInformation(java.math.BigInteger id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 400;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "AbstractCharacterInformation(" + "id=" + this.id + ')';
  }
}
