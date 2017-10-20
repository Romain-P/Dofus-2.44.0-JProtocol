// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredInformations
    extends com.ankamagames.dofus.network.types.game.friend.AbstractContactInformations {
  public static final int PROTOCOL_ID = 106;

  public IgnoredInformations() {}

  public IgnoredInformations(int accountId, java.lang.String accountName) {

    super(accountId, accountName);
  }

  @Override
  public int getProtocolId() {
    return 106;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "IgnoredInformations("
        + "accountId="
        + this.accountId
        + ", accountName="
        + this.accountName
        + ')';
  }
}
