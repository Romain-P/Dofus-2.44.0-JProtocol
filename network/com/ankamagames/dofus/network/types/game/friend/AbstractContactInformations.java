// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractContactInformations extends NetworkType {
  public static final int PROTOCOL_ID = 380;
  // i32
  public int accountId;
  // str
  public java.lang.String accountName;

  public AbstractContactInformations() {}

  public AbstractContactInformations(int accountId, java.lang.String accountName) {
    this.accountId = accountId;
    this.accountName = accountName;
  }

  @Override
  public int getProtocolId() {
    return 380;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.accountId);
    writer.write_str(this.accountName);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.accountId = reader.read_i32();
    this.accountName = reader.read_str();
  }

  @Override
  public String toString() {

    return "AbstractContactInformations("
        + "accountId="
        + this.accountId
        + ", accountName="
        + this.accountName
        + ')';
  }
}
