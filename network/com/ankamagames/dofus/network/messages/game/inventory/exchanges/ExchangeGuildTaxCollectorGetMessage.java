// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeGuildTaxCollectorGetMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5762;
  // str
  public java.lang.String collectorName;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;
  // str
  public java.lang.String userName;
  // ui64
  public java.math.BigInteger callerId;
  // str
  public java.lang.String callerName;
  // f64
  public double experience;
  // vi16
  public short pods;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[]
      objectsInfos;

  public ExchangeGuildTaxCollectorGetMessage()
  {}

  public ExchangeGuildTaxCollectorGetMessage(
      java.lang.String collectorName,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      java.lang.String userName,
      java.math.BigInteger callerId,
      java.lang.String callerName,
      double experience,
      short pods,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[]
          objectsInfos)
  {
    this.collectorName = collectorName;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.userName = userName;
    this.callerId = callerId;
    this.callerName = callerName;
    this.experience = experience;
    this.pods = pods;
    this.objectsInfos = objectsInfos;
  }

  public ExchangeGuildTaxCollectorGetMessage(
      java.lang.String collectorName,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      java.lang.String userName,
      java.math.BigInteger callerId,
      java.lang.String callerName,
      double experience,
      short pods,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity>
          objectsInfos)
  {
    this.collectorName = collectorName;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.userName = userName;
    this.callerId = callerId;
    this.callerName = callerName;
    this.experience = experience;
    this.pods = pods;
    this.objectsInfos =
        objectsInfos.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5762;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.collectorName);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
    writer.write_str(this.userName);
    writer.write_ui64(this.callerId);
    writer.write_str(this.callerName);
    writer.write_f64(this.experience);
    writer.write_vi16(this.pods);
    writer.write_ui16(objectsInfos.length);

    for (int i = 0; i < objectsInfos.length; i++)
  {

      objectsInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.collectorName = reader.read_str();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();
    this.userName = reader.read_str();
    this.callerId = reader.read_ui64();
    this.callerName = reader.read_str();
    this.experience = reader.read_f64();
    this.pods = reader.read_vi16();

    int objectsInfos_length = reader.read_ui16();
    this.objectsInfos =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
            [objectsInfos_length];

    for (int i = 0; i < objectsInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
          objectsInfos_it =
              new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity();

      objectsInfos_it.deserialize(reader);
      this.objectsInfos[i] = objectsInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeGuildTaxCollectorGetMessage("
        + "collectorName="
        + this.collectorName
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ", userName="
        + this.userName
        + ", callerId="
        + this.callerId
        + ", callerName="
        + this.callerName
        + ", experience="
        + this.experience
        + ", pods="
        + this.pods
        + ", objectsInfos="
        + java.util.Arrays.toString(this.objectsInfos)
        + ')';
  }
}
