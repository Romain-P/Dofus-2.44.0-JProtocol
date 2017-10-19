// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.data.items.effects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectEffectDice
    extends com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect {
  public static final int PROTOCOL_ID = 73;
  // vi16
  public short diceNum;
  // vi16
  public short diceSide;
  // vi16
  public short diceConst;

  public ObjectEffectDice()
  {}

  public ObjectEffectDice(short actionId, short diceNum, short diceSide, short diceConst)
  {

    super(actionId);
    this.diceNum = diceNum;
    this.diceSide = diceSide;
    this.diceConst = diceConst;
  }

  @Override
  public int getProtocolId()
  {
    return 73;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.diceNum);
    writer.write_vi16(this.diceSide);
    writer.write_vi16(this.diceConst);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.diceNum = reader.read_vi16();
    this.diceSide = reader.read_vi16();
    this.diceConst = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ObjectEffectDice("
        + "actionId="
        + this.actionId
        + ", diceNum="
        + this.diceNum
        + ", diceSide="
        + this.diceSide
        + ", diceConst="
        + this.diceConst
        + ')';
  }
}
