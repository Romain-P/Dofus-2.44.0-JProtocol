// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSettingsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6340;
  // str
  public java.lang.String lang;
  // i8
  public byte community;
  // i8
  public byte gameType;
  // vi16
  public short arenaLeaveBanTime;

  public ServerSettingsMessage() {}

  public ServerSettingsMessage(
      java.lang.String lang, byte community, byte gameType, short arenaLeaveBanTime) {
    this.lang = lang;
    this.community = community;
    this.gameType = gameType;
    this.arenaLeaveBanTime = arenaLeaveBanTime;
  }

  @Override
  public int getProtocolId() {
    return 6340;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.lang);
    writer.write_i8(this.community);
    writer.write_i8(this.gameType);
    writer.write_vi16(this.arenaLeaveBanTime);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.lang = reader.read_str();
    this.community = reader.read_i8();
    this.gameType = reader.read_i8();
    this.arenaLeaveBanTime = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ServerSettingsMessage("
        + "lang="
        + this.lang
        + ", community="
        + this.community
        + ", gameType="
        + this.gameType
        + ", arenaLeaveBanTime="
        + this.arenaLeaveBanTime
        + ')';
  }
}
