// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EnterHavenBagRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6636;
  // vi64
  public long havenBagOwner;

  public EnterHavenBagRequestMessage() {}

  public EnterHavenBagRequestMessage(long havenBagOwner) {
    this.havenBagOwner = havenBagOwner;
  }

  @Override
  public int getProtocolId() {
    return 6636;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.havenBagOwner);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.havenBagOwner = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "EnterHavenBagRequestMessage(" + "havenBagOwner=" + this.havenBagOwner + ')';
  }
}
