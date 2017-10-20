// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartedWithPodsMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeStartedMessage {
  public static final int PROTOCOL_ID = 6129;
  // f64
  public double firstCharacterId;
  // vi32
  public int firstCharacterCurrentWeight;
  // vi32
  public int firstCharacterMaxWeight;
  // f64
  public double secondCharacterId;
  // vi32
  public int secondCharacterCurrentWeight;
  // vi32
  public int secondCharacterMaxWeight;

  public ExchangeStartedWithPodsMessage() {}

  public ExchangeStartedWithPodsMessage(
      byte exchangeType,
      double firstCharacterId,
      int firstCharacterCurrentWeight,
      int firstCharacterMaxWeight,
      double secondCharacterId,
      int secondCharacterCurrentWeight,
      int secondCharacterMaxWeight) {

    super(exchangeType);
    this.firstCharacterId = firstCharacterId;
    this.firstCharacterCurrentWeight = firstCharacterCurrentWeight;
    this.firstCharacterMaxWeight = firstCharacterMaxWeight;
    this.secondCharacterId = secondCharacterId;
    this.secondCharacterCurrentWeight = secondCharacterCurrentWeight;
    this.secondCharacterMaxWeight = secondCharacterMaxWeight;
  }

  @Override
  public int getProtocolId() {
    return 6129;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.firstCharacterId);
    writer.write_vi32(this.firstCharacterCurrentWeight);
    writer.write_vi32(this.firstCharacterMaxWeight);
    writer.write_f64(this.secondCharacterId);
    writer.write_vi32(this.secondCharacterCurrentWeight);
    writer.write_vi32(this.secondCharacterMaxWeight);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.firstCharacterId = reader.read_f64();
    this.firstCharacterCurrentWeight = reader.read_vi32();
    this.firstCharacterMaxWeight = reader.read_vi32();
    this.secondCharacterId = reader.read_f64();
    this.secondCharacterCurrentWeight = reader.read_vi32();
    this.secondCharacterMaxWeight = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeStartedWithPodsMessage("
        + "exchangeType="
        + this.exchangeType
        + ", firstCharacterId="
        + this.firstCharacterId
        + ", firstCharacterCurrentWeight="
        + this.firstCharacterCurrentWeight
        + ", firstCharacterMaxWeight="
        + this.firstCharacterMaxWeight
        + ", secondCharacterId="
        + this.secondCharacterId
        + ", secondCharacterCurrentWeight="
        + this.secondCharacterCurrentWeight
        + ", secondCharacterMaxWeight="
        + this.secondCharacterMaxWeight
        + ')';
  }
}
