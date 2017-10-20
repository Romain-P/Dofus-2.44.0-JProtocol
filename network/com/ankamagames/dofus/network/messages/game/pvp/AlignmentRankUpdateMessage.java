// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.pvp;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlignmentRankUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6058;
  // i8
  public byte alignmentRank;
  // bool
  public boolean verbose;

  public AlignmentRankUpdateMessage() {}

  public AlignmentRankUpdateMessage(byte alignmentRank, boolean verbose) {
    this.alignmentRank = alignmentRank;
    this.verbose = verbose;
  }

  @Override
  public int getProtocolId() {
    return 6058;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.alignmentRank);
    writer.write_bool(this.verbose);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.alignmentRank = reader.read_i8();
    this.verbose = reader.read_bool();
  }

  @Override
  public String toString() {

    return "AlignmentRankUpdateMessage("
        + "alignmentRank="
        + this.alignmentRank
        + ", verbose="
        + this.verbose
        + ')';
  }
}
