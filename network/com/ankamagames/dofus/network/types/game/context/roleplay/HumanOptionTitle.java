// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HumanOptionTitle
    extends com.ankamagames.dofus.network.types.game.context.roleplay.HumanOption {
  public static final int PROTOCOL_ID = 408;
  // vi16
  public short titleId;
  // str
  public java.lang.String titleParam;

  public HumanOptionTitle() {}

  public HumanOptionTitle(short titleId, java.lang.String titleParam) {

    super();
    this.titleId = titleId;
    this.titleParam = titleParam;
  }

  @Override
  public int getProtocolId() {
    return 408;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.titleId);
    writer.write_str(this.titleParam);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.titleId = reader.read_vi16();
    this.titleParam = reader.read_str();
  }

  @Override
  public String toString() {

    return "HumanOptionTitle("
        + "titleId="
        + this.titleId
        + ", titleParam="
        + this.titleParam
        + ')';
  }
}
