// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.ui;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ClientUIOpenedByObjectMessage
    extends com.ankamagames.dofus.network.messages.game.ui.ClientUIOpenedMessage {
  public static final int PROTOCOL_ID = 6463;
  // vi32
  public int uid;

  public ClientUIOpenedByObjectMessage()
  {}

  public ClientUIOpenedByObjectMessage(byte type, int uid)
  {

    super(type);
    this.uid = uid;
  }

  @Override
  public int getProtocolId()
  {
    return 6463;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.uid);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.uid = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ClientUIOpenedByObjectMessage(" + "type=" + this.type + ", uid=" + this.uid + ')';
  }
}
