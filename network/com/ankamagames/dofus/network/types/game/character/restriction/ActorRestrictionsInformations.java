// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.restriction;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ActorRestrictionsInformations extends NetworkType {
  public static final int PROTOCOL_ID = 204;
  // flag,_loc2_,0
  public boolean cantBeAggressed;
  // flag,_loc2_,1
  public boolean cantBeChallenged;
  // flag,_loc2_,2
  public boolean cantTrade;
  // flag,_loc2_,3
  public boolean cantBeAttackedByMutant;
  // flag,_loc2_,4
  public boolean cantRun;
  // flag,_loc2_,5
  public boolean forceSlowWalk;
  // flag,_loc2_,6
  public boolean cantMinimize;
  // flag,_loc2_,7
  public boolean cantMove;
  // flag,_loc3_,0
  public boolean cantAggress;
  // flag,_loc3_,1
  public boolean cantChallenge;
  // flag,_loc3_,2
  public boolean cantExchange;
  // flag,_loc3_,3
  public boolean cantAttack;
  // flag,_loc3_,4
  public boolean cantChat;
  // flag,_loc3_,5
  public boolean cantBeMerchant;
  // flag,_loc3_,6
  public boolean cantUseObject;
  // flag,_loc3_,7
  public boolean cantUseTaxCollector;
  // flag,_loc4_,0
  public boolean cantUseInteractive;
  // flag,_loc4_,1
  public boolean cantSpeakToNPC;
  // flag,_loc4_,2
  public boolean cantChangeZone;
  // flag,_loc4_,3
  public boolean cantAttackMonster;
  // flag,_loc4_,4
  public boolean cantWalk8Directions;

  public ActorRestrictionsInformations()
  {}

  public ActorRestrictionsInformations(
      boolean cantBeAggressed,
      boolean cantBeChallenged,
      boolean cantTrade,
      boolean cantBeAttackedByMutant,
      boolean cantRun,
      boolean forceSlowWalk,
      boolean cantMinimize,
      boolean cantMove,
      boolean cantAggress,
      boolean cantChallenge,
      boolean cantExchange,
      boolean cantAttack,
      boolean cantChat,
      boolean cantBeMerchant,
      boolean cantUseObject,
      boolean cantUseTaxCollector,
      boolean cantUseInteractive,
      boolean cantSpeakToNPC,
      boolean cantChangeZone,
      boolean cantAttackMonster,
      boolean cantWalk8Directions)
  {
    this.cantBeAggressed = cantBeAggressed;
    this.cantBeChallenged = cantBeChallenged;
    this.cantTrade = cantTrade;
    this.cantBeAttackedByMutant = cantBeAttackedByMutant;
    this.cantRun = cantRun;
    this.forceSlowWalk = forceSlowWalk;
    this.cantMinimize = cantMinimize;
    this.cantMove = cantMove;
    this.cantAggress = cantAggress;
    this.cantChallenge = cantChallenge;
    this.cantExchange = cantExchange;
    this.cantAttack = cantAttack;
    this.cantChat = cantChat;
    this.cantBeMerchant = cantBeMerchant;
    this.cantUseObject = cantUseObject;
    this.cantUseTaxCollector = cantUseTaxCollector;
    this.cantUseInteractive = cantUseInteractive;
    this.cantSpeakToNPC = cantSpeakToNPC;
    this.cantChangeZone = cantChangeZone;
    this.cantAttackMonster = cantAttackMonster;
    this.cantWalk8Directions = cantWalk8Directions;
  }

  @Override
  public int getProtocolId()
  {
    return 204;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantBeAggressed, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantBeChallenged, 1);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantTrade, 2);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantBeAttackedByMutant, 3);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantRun, 4);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.forceSlowWalk, 5);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantMinimize, 6);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.cantMove, 7);
    writer.write_i8(_loc2_);

    int _loc3_ = 0;
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantAggress, 0);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantChallenge, 1);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantExchange, 2);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantAttack, 3);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantChat, 4);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantBeMerchant, 5);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantUseObject, 6);
    _loc3_ = BooleanByteWrapper.setFlag(_loc3_, this.cantUseTaxCollector, 7);
    writer.write_i8(_loc3_);

    int _loc4_ = 0;
    _loc4_ = BooleanByteWrapper.setFlag(_loc4_, this.cantUseInteractive, 0);
    _loc4_ = BooleanByteWrapper.setFlag(_loc4_, this.cantSpeakToNPC, 1);
    _loc4_ = BooleanByteWrapper.setFlag(_loc4_, this.cantChangeZone, 2);
    _loc4_ = BooleanByteWrapper.setFlag(_loc4_, this.cantAttackMonster, 3);
    _loc4_ = BooleanByteWrapper.setFlag(_loc4_, this.cantWalk8Directions, 4);
    writer.write_i8(_loc4_);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.cantBeAggressed = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.cantBeChallenged = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.cantTrade = BooleanByteWrapper.getFlag(_loc2_, 2);
    this.cantBeAttackedByMutant = BooleanByteWrapper.getFlag(_loc2_, 3);
    this.cantRun = BooleanByteWrapper.getFlag(_loc2_, 4);
    this.forceSlowWalk = BooleanByteWrapper.getFlag(_loc2_, 5);
    this.cantMinimize = BooleanByteWrapper.getFlag(_loc2_, 6);
    this.cantMove = BooleanByteWrapper.getFlag(_loc2_, 7);

    int _loc3_ = reader.read_i8();
    this.cantAggress = BooleanByteWrapper.getFlag(_loc3_, 0);
    this.cantChallenge = BooleanByteWrapper.getFlag(_loc3_, 1);
    this.cantExchange = BooleanByteWrapper.getFlag(_loc3_, 2);
    this.cantAttack = BooleanByteWrapper.getFlag(_loc3_, 3);
    this.cantChat = BooleanByteWrapper.getFlag(_loc3_, 4);
    this.cantBeMerchant = BooleanByteWrapper.getFlag(_loc3_, 5);
    this.cantUseObject = BooleanByteWrapper.getFlag(_loc3_, 6);
    this.cantUseTaxCollector = BooleanByteWrapper.getFlag(_loc3_, 7);

    int _loc4_ = reader.read_i8();
    this.cantUseInteractive = BooleanByteWrapper.getFlag(_loc4_, 0);
    this.cantSpeakToNPC = BooleanByteWrapper.getFlag(_loc4_, 1);
    this.cantChangeZone = BooleanByteWrapper.getFlag(_loc4_, 2);
    this.cantAttackMonster = BooleanByteWrapper.getFlag(_loc4_, 3);
    this.cantWalk8Directions = BooleanByteWrapper.getFlag(_loc4_, 4);
  }

  @Override
  public String toString()
  {

    return "ActorRestrictionsInformations("
        + "cantBeAggressed="
        + this.cantBeAggressed
        + ", cantBeChallenged="
        + this.cantBeChallenged
        + ", cantTrade="
        + this.cantTrade
        + ", cantBeAttackedByMutant="
        + this.cantBeAttackedByMutant
        + ", cantRun="
        + this.cantRun
        + ", forceSlowWalk="
        + this.forceSlowWalk
        + ", cantMinimize="
        + this.cantMinimize
        + ", cantMove="
        + this.cantMove
        + ", cantAggress="
        + this.cantAggress
        + ", cantChallenge="
        + this.cantChallenge
        + ", cantExchange="
        + this.cantExchange
        + ", cantAttack="
        + this.cantAttack
        + ", cantChat="
        + this.cantChat
        + ", cantBeMerchant="
        + this.cantBeMerchant
        + ", cantUseObject="
        + this.cantUseObject
        + ", cantUseTaxCollector="
        + this.cantUseTaxCollector
        + ", cantUseInteractive="
        + this.cantUseInteractive
        + ", cantSpeakToNPC="
        + this.cantSpeakToNPC
        + ", cantChangeZone="
        + this.cantChangeZone
        + ", cantAttackMonster="
        + this.cantAttackMonster
        + ", cantWalk8Directions="
        + this.cantWalk8Directions
        + ')';
  }
}
