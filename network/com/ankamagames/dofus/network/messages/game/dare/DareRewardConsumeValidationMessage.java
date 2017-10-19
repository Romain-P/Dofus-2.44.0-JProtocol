// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareRewardConsumeValidationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6675;
  // f64
  public double dareId;
  // i8
  public byte type;

  public DareRewardConsumeValidationMessage()
  {}

  public DareRewardConsumeValidationMessage(double dareId, byte type)
  {
    this.dareId = dareId;
    this.type = type;
  }

  @Override
  public int getProtocolId()
  {
    return 6675;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.dareId);
    writer.write_i8(this.type);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dareId = reader.read_f64();
    this.type = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "DareRewardConsumeValidationMessage("
        + "dareId="
        + this.dareId
        + ", type="
        + this.type
        + ')';
  }
}
