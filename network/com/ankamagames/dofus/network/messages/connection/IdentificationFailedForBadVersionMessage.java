// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationFailedForBadVersionMessage
    extends com.ankamagames.dofus.network.messages.connection.IdentificationFailedMessage {
  public static final int PROTOCOL_ID = 21;
  // com.ankamagames.dofus.network.types.version.Version
  public com.ankamagames.dofus.network.types.version.Version requiredVersion;

  public IdentificationFailedForBadVersionMessage() {}

  public IdentificationFailedForBadVersionMessage(
      byte reason, com.ankamagames.dofus.network.types.version.Version requiredVersion) {

    super(reason);
    this.requiredVersion = requiredVersion;
  }

  @Override
  public int getProtocolId() {
    return 21;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.requiredVersion.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.requiredVersion = new com.ankamagames.dofus.network.types.version.Version();
    this.requiredVersion.deserialize(reader);
  }

  @Override
  public String toString() {

    return "IdentificationFailedForBadVersionMessage("
        + "reason="
        + this.reason
        + ", requiredVersion="
        + this.requiredVersion
        + ')';
  }
}
