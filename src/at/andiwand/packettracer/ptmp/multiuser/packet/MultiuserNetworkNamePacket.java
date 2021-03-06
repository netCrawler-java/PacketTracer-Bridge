package at.andiwand.packettracer.ptmp.multiuser.packet;

import at.andiwand.packettracer.ptmp.PTMPDataReader;
import at.andiwand.packettracer.ptmp.PTMPDataWriter;
import at.andiwand.packettracer.ptmp.packet.PTMPEncodedPacket;


public class MultiuserNetworkNamePacket extends MultiuserPacket {
	
	public static final int TYPE = TYPE_NETWORK_NAME;
	
	
	
	
	private String networkName;
	
	
	
	public MultiuserNetworkNamePacket(String networkName) {
		super(TYPE);
		
		this.networkName = networkName;
	}
	public MultiuserNetworkNamePacket(PTMPDataReader reader) {
		super(reader);
	}
	public MultiuserNetworkNamePacket(byte[] packet, int encoding) {
		super(packet, encoding);
	}
	public MultiuserNetworkNamePacket(PTMPEncodedPacket packet) {
		super(packet);
	}
	public MultiuserNetworkNamePacket(MultiuserNetworkNamePacket packet) {
		super(packet);
		
		networkName = packet.networkName;
	}
	
	
	
	public String getNetworkName() {
		return networkName;
	}
	public void getValue(PTMPDataWriter writer) {
		writer.writeString(networkName);
	}
	
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	
	
	public void parseValue(PTMPDataReader reader) {
		networkName = reader.readString();
	}
	
	
	protected boolean legalType2(int type) {
		return type == TYPE;
	}
	
}