// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobBookSubscription extends NetworkType {
  public static final int PROTOCOL_ID = 500;
  // i8
  public byte jobId;
  // bool
  public boolean subscribed;

  public JobBookSubscription() {}

  public JobBookSubscription(byte jobId, boolean subscribed) {
    this.jobId = jobId;
    this.subscribed = subscribed;
  }

  @Override
  public int getProtocolId() {
    return 500;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_bool(this.subscribed);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
    this.subscribed = reader.read_bool();
  }

  @Override
  public String toString() {

    return "JobBookSubscription(" + "jobId=" + this.jobId + ", subscribed=" + this.subscribed + ')';
  }
}
