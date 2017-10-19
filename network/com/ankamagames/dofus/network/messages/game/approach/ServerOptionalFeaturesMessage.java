// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerOptionalFeaturesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6305;
  // array,i8
  public byte[] features;

  public ServerOptionalFeaturesMessage()
  {}

  public ServerOptionalFeaturesMessage(byte[] features)
  {
    this.features = features;
  }

  @Override
  public int getProtocolId()
  {
    return 6305;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(features.length);
    writer.write_array_i8(this.features);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int features_length = reader.read_ui16();
    this.features = reader.read_array_i8(features_length);
  }

  @Override
  public String toString()
  {

    return "ServerOptionalFeaturesMessage(" + "features=" + +this.features.length + "b" + ')';
  }
}
