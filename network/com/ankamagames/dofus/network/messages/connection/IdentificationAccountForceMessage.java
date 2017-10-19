// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationAccountForceMessage
    extends com.ankamagames.dofus.network.messages.connection.IdentificationMessage {
  public static final int PROTOCOL_ID = 6119;
  // str
  public java.lang.String forcedAccountLogin;

  public IdentificationAccountForceMessage()
  {}

  public IdentificationAccountForceMessage(
      boolean autoconnect,
      boolean useCertificate,
      boolean useLoginToken,
      com.ankamagames.dofus.network.types.version.VersionExtended version,
      java.lang.String lang,
      byte[] credentials,
      short serverId,
      long sessionOptionalSalt,
      short[] failedAttempts,
      java.lang.String forcedAccountLogin)
  {

    super(
        autoconnect,
        useCertificate,
        useLoginToken,
        version,
        lang,
        credentials,
        serverId,
        sessionOptionalSalt,
        failedAttempts);
    this.forcedAccountLogin = forcedAccountLogin;
  }

  @Override
  public int getProtocolId()
  {
    return 6119;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.forcedAccountLogin);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.forcedAccountLogin = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "IdentificationAccountForceMessage("
        + "autoconnect="
        + this.autoconnect
        + ", useCertificate="
        + this.useCertificate
        + ", useLoginToken="
        + this.useLoginToken
        + ", version="
        + this.version
        + ", lang="
        + this.lang
        + ", credentials="
        + +this.credentials.length
        + "b"
        + ", serverId="
        + this.serverId
        + ", sessionOptionalSalt="
        + this.sessionOptionalSalt
        + ", failedAttempts="
        + java.util.Arrays.toString(this.failedAttempts)
        + ", forcedAccountLogin="
        + this.forcedAccountLogin
        + ')';
  }
}
