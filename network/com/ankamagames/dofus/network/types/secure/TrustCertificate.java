// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.secure;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TrustCertificate extends NetworkType {
  public static final int PROTOCOL_ID = 377;
  // i32
  public int id;
  // str
  public java.lang.String hash;

  public TrustCertificate() {}

  public TrustCertificate(int id, java.lang.String hash) {
    this.id = id;
    this.hash = hash;
  }

  @Override
  public int getProtocolId() {
    return 377;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.id);
    writer.write_str(this.hash);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_i32();
    this.hash = reader.read_str();
  }

  @Override
  public String toString() {

    return "TrustCertificate(" + "id=" + this.id + ", hash=" + this.hash + ')';
  }
}
