// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlliancePartialListMessage
    extends com.ankamagames.dofus.network.messages.game.alliance.AllianceListMessage {
  public static final int PROTOCOL_ID = 6427;

  public AlliancePartialListMessage()
  {}

  public AlliancePartialListMessage(
      com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations[] alliances)
  {

    super(alliances);
  }

  public AlliancePartialListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.social.AllianceFactSheetInformations>
          alliances)
  {

    super(alliances);
  }

  @Override
  public int getProtocolId()
  {
    return 6427;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "AlliancePartialListMessage("
        + "alliances="
        + java.util.Arrays.toString(this.alliances)
        + ')';
  }
}
