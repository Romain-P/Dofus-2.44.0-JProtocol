// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KohUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6439;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations[] alliances;
  // array,vi16
  public short[] allianceNbMembers;
  // array,vi32
  public int[] allianceRoundWeigth;
  // array,i8
  public byte[] allianceMatchScore;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
      allianceMapWinner;
  // vi32
  public int allianceMapWinnerScore;
  // vi32
  public int allianceMapMyAllianceScore;
  // f64
  public double nextTickTime;

  public KohUpdateMessage()
  {}

  public KohUpdateMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations[] alliances,
      short[] allianceNbMembers,
      int[] allianceRoundWeigth,
      byte[] allianceMatchScore,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
          allianceMapWinner,
      int allianceMapWinnerScore,
      int allianceMapMyAllianceScore,
      double nextTickTime)
  {
    this.alliances = alliances;
    this.allianceNbMembers = allianceNbMembers;
    this.allianceRoundWeigth = allianceRoundWeigth;
    this.allianceMatchScore = allianceMatchScore;
    this.allianceMapWinner = allianceMapWinner;
    this.allianceMapWinnerScore = allianceMapWinnerScore;
    this.allianceMapMyAllianceScore = allianceMapMyAllianceScore;
    this.nextTickTime = nextTickTime;
  }

  public KohUpdateMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations>
          alliances,
      short[] allianceNbMembers,
      int[] allianceRoundWeigth,
      byte[] allianceMatchScore,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
          allianceMapWinner,
      int allianceMapWinnerScore,
      int allianceMapMyAllianceScore,
      double nextTickTime)
  {
    this.alliances =
        alliances.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations[]::new);
    this.allianceNbMembers = allianceNbMembers;
    this.allianceRoundWeigth = allianceRoundWeigth;
    this.allianceMatchScore = allianceMatchScore;
    this.allianceMapWinner = allianceMapWinner;
    this.allianceMapWinnerScore = allianceMapWinnerScore;
    this.allianceMapMyAllianceScore = allianceMapMyAllianceScore;
    this.nextTickTime = nextTickTime;
  }

  @Override
  public int getProtocolId()
  {
    return 6439;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(alliances.length);

    for (int i = 0; i < alliances.length; i++)
  {

      alliances[i].serialize(writer);
    }
    writer.write_ui16(allianceNbMembers.length);
    writer.write_array_vi16(this.allianceNbMembers);
    writer.write_ui16(allianceRoundWeigth.length);
    writer.write_array_vi32(this.allianceRoundWeigth);
    writer.write_ui16(allianceMatchScore.length);
    writer.write_array_i8(this.allianceMatchScore);
    this.allianceMapWinner.serialize(writer);
    writer.write_vi32(this.allianceMapWinnerScore);
    writer.write_vi32(this.allianceMapMyAllianceScore);
    writer.write_f64(this.nextTickTime);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int alliances_length = reader.read_ui16();
    this.alliances =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
            [alliances_length];

    for (int i = 0; i < alliances_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations alliances_it =
          new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations();

      alliances_it.deserialize(reader);
      this.alliances[i] = alliances_it;
    }

    int allianceNbMembers_length = reader.read_ui16();
    this.allianceNbMembers = reader.read_array_vi16(allianceNbMembers_length);

    int allianceRoundWeigth_length = reader.read_ui16();
    this.allianceRoundWeigth = reader.read_array_vi32(allianceRoundWeigth_length);

    int allianceMatchScore_length = reader.read_ui16();
    this.allianceMatchScore = reader.read_array_i8(allianceMatchScore_length);
    this.allianceMapWinner =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations();
    this.allianceMapWinner.deserialize(reader);
    this.allianceMapWinnerScore = reader.read_vi32();
    this.allianceMapMyAllianceScore = reader.read_vi32();
    this.nextTickTime = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "KohUpdateMessage("
        + "alliances="
        + java.util.Arrays.toString(this.alliances)
        + ", allianceNbMembers="
        + java.util.Arrays.toString(this.allianceNbMembers)
        + ", allianceRoundWeigth="
        + java.util.Arrays.toString(this.allianceRoundWeigth)
        + ", allianceMatchScore="
        + +this.allianceMatchScore.length
        + "b"
        + ", allianceMapWinner="
        + this.allianceMapWinner
        + ", allianceMapWinnerScore="
        + this.allianceMapWinnerScore
        + ", allianceMapMyAllianceScore="
        + this.allianceMapMyAllianceScore
        + ", nextTickTime="
        + this.nextTickTime
        + ')';
  }
}
