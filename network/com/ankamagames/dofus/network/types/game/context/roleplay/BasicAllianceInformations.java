// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicAllianceInformations
    extends com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos {
  public static final int PROTOCOL_ID = 419;
  // vi32
  public int allianceId;
  // str
  public java.lang.String allianceTag;

  public BasicAllianceInformations()
  {}

  public BasicAllianceInformations(int allianceId, java.lang.String allianceTag)
  {

    super();
    this.allianceId = allianceId;
    this.allianceTag = allianceTag;
  }

  @Override
  public int getProtocolId()
  {
    return 419;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.allianceId);
    writer.write_str(this.allianceTag);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.allianceId = reader.read_vi32();
    this.allianceTag = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "BasicAllianceInformations("
        + "allianceId="
        + this.allianceId
        + ", allianceTag="
        + this.allianceTag
        + ')';
  }
}
