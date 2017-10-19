// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInsiderPrismInformation
    extends com.ankamagames.dofus.network.types.game.prism.PrismInformation {
  public static final int PROTOCOL_ID = 431;
  // i32
  public int lastTimeSlotModificationDate;
  // vi32
  public int lastTimeSlotModificationAuthorGuildId;
  // ui64
  public java.math.BigInteger lastTimeSlotModificationAuthorId;
  // str
  public java.lang.String lastTimeSlotModificationAuthorName;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] modulesObjects;

  public AllianceInsiderPrismInformation()
  {}

  public AllianceInsiderPrismInformation(
      byte typeId,
      byte state,
      int nextVulnerabilityDate,
      int placementDate,
      int rewardTokenCount,
      int lastTimeSlotModificationDate,
      int lastTimeSlotModificationAuthorGuildId,
      java.math.BigInteger lastTimeSlotModificationAuthorId,
      java.lang.String lastTimeSlotModificationAuthorName,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] modulesObjects)
  {

    super(typeId, state, nextVulnerabilityDate, placementDate, rewardTokenCount);
    this.lastTimeSlotModificationDate = lastTimeSlotModificationDate;
    this.lastTimeSlotModificationAuthorGuildId = lastTimeSlotModificationAuthorGuildId;
    this.lastTimeSlotModificationAuthorId = lastTimeSlotModificationAuthorId;
    this.lastTimeSlotModificationAuthorName = lastTimeSlotModificationAuthorName;
    this.modulesObjects = modulesObjects;
  }

  public AllianceInsiderPrismInformation(
      byte typeId,
      byte state,
      int nextVulnerabilityDate,
      int placementDate,
      int rewardTokenCount,
      int lastTimeSlotModificationDate,
      int lastTimeSlotModificationAuthorGuildId,
      java.math.BigInteger lastTimeSlotModificationAuthorId,
      java.lang.String lastTimeSlotModificationAuthorName,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          modulesObjects)
  {

    super(typeId, state, nextVulnerabilityDate, placementDate, rewardTokenCount);
    this.lastTimeSlotModificationDate = lastTimeSlotModificationDate;
    this.lastTimeSlotModificationAuthorGuildId = lastTimeSlotModificationAuthorGuildId;
    this.lastTimeSlotModificationAuthorId = lastTimeSlotModificationAuthorId;
    this.lastTimeSlotModificationAuthorName = lastTimeSlotModificationAuthorName;
    this.modulesObjects =
        modulesObjects.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 431;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.lastTimeSlotModificationDate);
    writer.write_vi32(this.lastTimeSlotModificationAuthorGuildId);
    writer.write_ui64(this.lastTimeSlotModificationAuthorId);
    writer.write_str(this.lastTimeSlotModificationAuthorName);
    writer.write_ui16(modulesObjects.length);

    for (int i = 0; i < modulesObjects.length; i++)
  {

      modulesObjects[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.lastTimeSlotModificationDate = reader.read_i32();
    this.lastTimeSlotModificationAuthorGuildId = reader.read_vi32();
    this.lastTimeSlotModificationAuthorId = reader.read_ui64();
    this.lastTimeSlotModificationAuthorName = reader.read_str();

    int modulesObjects_length = reader.read_ui16();
    this.modulesObjects =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[modulesObjects_length];

    for (int i = 0; i < modulesObjects_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem modulesObjects_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      modulesObjects_it.deserialize(reader);
      this.modulesObjects[i] = modulesObjects_it;
    }
  }

  @Override
  public String toString()
  {

    return "AllianceInsiderPrismInformation("
        + "typeId="
        + this.typeId
        + ", state="
        + this.state
        + ", nextVulnerabilityDate="
        + this.nextVulnerabilityDate
        + ", placementDate="
        + this.placementDate
        + ", rewardTokenCount="
        + this.rewardTokenCount
        + ", lastTimeSlotModificationDate="
        + this.lastTimeSlotModificationDate
        + ", lastTimeSlotModificationAuthorGuildId="
        + this.lastTimeSlotModificationAuthorGuildId
        + ", lastTimeSlotModificationAuthorId="
        + this.lastTimeSlotModificationAuthorId
        + ", lastTimeSlotModificationAuthorName="
        + this.lastTimeSlotModificationAuthorName
        + ", modulesObjects="
        + java.util.Arrays.toString(this.modulesObjects)
        + ')';
  }
}
