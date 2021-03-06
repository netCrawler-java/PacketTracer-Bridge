package at.andiwand.packettracer.ptmp.packet;

import at.andiwand.packettracer.ptmp.PTMPDataReader;
import at.andiwand.packettracer.ptmp.PTMPDataWriter;


public class PTMPDisconnectPacket extends PTMPPacket {
	
	public static final int TYPE = TYPE_DISCONNECT;
	
	public static final String NO_MESSAGE = "";
	
	
	
	
	private String message;
	
	
	
	public PTMPDisconnectPacket() {
		this(NO_MESSAGE);
	}
	public PTMPDisconnectPacket(String message) {
		super(TYPE);
	}
	public PTMPDisconnectPacket(PTMPDataReader reader) {
		super(reader);
	}
	public PTMPDisconnectPacket(byte[] packet, int encoding) {
		super(packet, encoding);
	}
	public PTMPDisconnectPacket(PTMPEncodedPacket packet) {
		super(packet);
	}
	public PTMPDisconnectPacket(PTMPDisconnectPacket packet) {
		super(packet);
		
		message = packet.message;
	}
	
	
	
	public String getMessage() {
		return message;
	}
	public void getValue(PTMPDataWriter writer) {
		writer.writeString(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void parseValue(PTMPDataReader reader) {
		message = reader.readString();
	}
	
	
	protected boolean legalType(int type) {
		return type == TYPE;
	}
	
}