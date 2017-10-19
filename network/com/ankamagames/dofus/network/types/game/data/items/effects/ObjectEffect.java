// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffect extends NetworkType {
  public static final int PROTOCOL_ID = 76;
  // vi16
  public short actionId;

  public ObjectEffect()
  {}

  public ObjectEffect(short actionId)
  {
    this.actionId = actionId;
  }

  @Override
  public int getProtocolId()
  {
    return 76;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.actionId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.actionId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ObjectEffect(" + "actionId=" + this.actionId + ')';
  }
}
