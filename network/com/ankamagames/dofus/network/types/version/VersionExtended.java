// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.version;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class VersionExtended extends com.ankamagames.dofus.network.types.version.Version {
  public static final int PROTOCOL_ID = 393;
  // i8
  public byte install;
  // i8
  public byte technology;

  public VersionExtended() {}

  public VersionExtended(
      byte major,
      byte minor,
      byte release,
      int revision,
      byte patch,
      byte buildType,
      byte install,
      byte technology) {

    super(major, minor, release, revision, patch, buildType);
    this.install = install;
    this.technology = technology;
  }

  @Override
  public int getProtocolId() {
    return 393;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.install);
    writer.write_i8(this.technology);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.install = reader.read_i8();
    this.technology = reader.read_i8();
  }

  @Override
  public String toString() {

    return "VersionExtended("
        + "major="
        + this.major
        + ", minor="
        + this.minor
        + ", release="
        + this.release
        + ", revision="
        + this.revision
        + ", patch="
        + this.patch
        + ", buildType="
        + this.buildType
        + ", install="
        + this.install
        + ", technology="
        + this.technology
        + ')';
  }
}
