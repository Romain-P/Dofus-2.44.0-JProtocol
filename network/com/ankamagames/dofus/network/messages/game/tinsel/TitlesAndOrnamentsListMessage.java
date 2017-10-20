// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TitlesAndOrnamentsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6367;
  // array,vi16
  public short[] titles;
  // array,vi16
  public short[] ornaments;
  // vi16
  public short activeTitle;
  // vi16
  public short activeOrnament;

  public TitlesAndOrnamentsListMessage() {}

  public TitlesAndOrnamentsListMessage(
      short[] titles, short[] ornaments, short activeTitle, short activeOrnament) {
    this.titles = titles;
    this.ornaments = ornaments;
    this.activeTitle = activeTitle;
    this.activeOrnament = activeOrnament;
  }

  @Override
  public int getProtocolId() {
    return 6367;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(titles.length);
    writer.write_array_vi16(this.titles);
    writer.write_ui16(ornaments.length);
    writer.write_array_vi16(this.ornaments);
    writer.write_vi16(this.activeTitle);
    writer.write_vi16(this.activeOrnament);
  }

  @Override
  public void deserialize(DataReader reader) {

    int titles_length = reader.read_ui16();
    this.titles = reader.read_array_vi16(titles_length);

    int ornaments_length = reader.read_ui16();
    this.ornaments = reader.read_array_vi16(ornaments_length);
    this.activeTitle = reader.read_vi16();
    this.activeOrnament = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "TitlesAndOrnamentsListMessage("
        + "titles="
        + java.util.Arrays.toString(this.titles)
        + ", ornaments="
        + java.util.Arrays.toString(this.ornaments)
        + ", activeTitle="
        + this.activeTitle
        + ", activeOrnament="
        + this.activeOrnament
        + ')';
  }
}
