// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountHarnessDissociateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6696;

  public MountHarnessDissociateRequestMessage() {}

  public static final MountHarnessDissociateRequestMessage i =
      new MountHarnessDissociateRequestMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6696;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "MountHarnessDissociateRequestMessage";
  }
}
