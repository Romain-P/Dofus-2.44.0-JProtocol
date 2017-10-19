// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightOptionsInformations extends NetworkType {
  public static final int PROTOCOL_ID = 20;
  // flag,_loc2_,0
  public boolean isSecret;
  // flag,_loc2_,1
  public boolean isRestrictedToPartyOnly;
  // flag,_loc2_,2
  public boolean isClosed;
  // flag,_loc2_,3
  public boolean isAskingForHelp;

  public FightOptionsInformations()
  {}

  public FightOptionsInformations(
      boolean isSecret,
      boolean isRestrictedToPartyOnly,
      boolean isClosed,
      boolean isAskingForHelp)
  {
    this.isSecret = isSecret;
    this.isRestrictedToPartyOnly = isRestrictedToPartyOnly;
    this.isClosed = isClosed;
    this.isAskingForHelp = isAskingForHelp;
  }

  @Override
  public int getProtocolId()
  {
    return 20;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isSecret, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isRestrictedToPartyOnly, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isClosed, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isAskingForHelp, 3);
    writer.write_i8(_loc2_);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.isSecret = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.isRestrictedToPartyOnly = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.isClosed = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.isAskingForHelp = BooleanByteWrapper.getFlag(_loc2_, 3);
  }

  @Override
  public String toString()
  {

    return "FightOptionsInformations("
        + "isSecret="
        + this.isSecret
        + ", isRestrictedToPartyOnly="
        + this.isRestrictedToPartyOnly
        + ", isClosed="
        + this.isClosed
        + ", isAskingForHelp="
        + this.isAskingForHelp
        + ')';
  }
}
