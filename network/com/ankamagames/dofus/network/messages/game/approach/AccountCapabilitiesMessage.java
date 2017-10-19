// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountCapabilitiesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6216;
  // flag,_loc2_,0
  public boolean tutorialAvailable;
  // flag,_loc2_,1
  public boolean canCreateNewCharacter;
  // i32
  public int accountId;
  // vi32
  public int breedsVisible;
  // vi32
  public int breedsAvailable;
  // i8
  public byte status;

  public AccountCapabilitiesMessage()
  {}

  public AccountCapabilitiesMessage(
      boolean tutorialAvailable,
      boolean canCreateNewCharacter,
      int accountId,
      int breedsVisible,
      int breedsAvailable,
      byte status)
  {
    this.tutorialAvailable = tutorialAvailable;
    this.canCreateNewCharacter = canCreateNewCharacter;
    this.accountId = accountId;
    this.breedsVisible = breedsVisible;
    this.breedsAvailable = breedsAvailable;
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 6216;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.tutorialAvailable, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.canCreateNewCharacter, 1);
    writer.write_i8(_loc2_);
    writer.write_i32(this.accountId);
    writer.write_vi32(this.breedsVisible);
    writer.write_vi32(this.breedsAvailable);
    writer.write_i8(this.status);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.tutorialAvailable = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.canCreateNewCharacter = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.accountId = reader.read_i32();
    this.breedsVisible = reader.read_vi32();
    this.breedsAvailable = reader.read_vi32();
    this.status = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AccountCapabilitiesMessage("
        + "tutorialAvailable="
        + this.tutorialAvailable
        + ", canCreateNewCharacter="
        + this.canCreateNewCharacter
        + ", accountId="
        + this.accountId
        + ", breedsVisible="
        + this.breedsVisible
        + ", breedsAvailable="
        + this.breedsAvailable
        + ", status="
        + this.status
        + ')';
  }
}
