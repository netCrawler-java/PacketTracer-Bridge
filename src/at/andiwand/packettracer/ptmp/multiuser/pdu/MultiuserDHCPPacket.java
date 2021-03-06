package at.andiwand.packettracer.ptmp.multiuser.pdu;

import java.net.Inet4Address;

import at.andiwand.library.network.mac.MACAddress;
import at.andiwand.packettracer.ptmp.PTMPDataReader;
import at.andiwand.packettracer.ptmp.PTMPDataWriter;


public class MultiuserDHCPPacket extends MultiuserProtocolDataUnit {
	
	private byte messageType;
	private byte unknown1;
	private byte unknown2;
	private byte unknown3;
	private String transactionId;
	private short secondsElapsed;
	private short flags;
	private int unknown4;
	private int unknown5;
	private int unknown6;
	private Inet4Address clientAddress;
	private Inet4Address yourAddress;
	private Inet4Address serverAddress;
	private Inet4Address gatewayAddress;
	private Inet4Address subnetMask;
	private MACAddress clientHardwareAddress;
	private String serverName;
	private String file;
	private Inet4Address tftpServerAddress;
	private int unknown7;
	private String unknown8;
	private Inet4Address dnsServerAddress;
	
	
	
	public byte getMessageType() {
		return messageType;
	}
	public byte getUnknown1() {
		return unknown1;
	}
	public byte getUnknown2() {
		return unknown2;
	}
	public byte getUnknown3() {
		return unknown3;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public short getSecondsElapsed() {
		return secondsElapsed;
	}
	public short getFlags() {
		return flags;
	}
	public int getUnknown4() {
		return unknown4;
	}
	public int getUnknown5() {
		return unknown5;
	}
	public int getUnknown6() {
		return unknown6;
	}
	public Inet4Address getClientAddress() {
		return clientAddress;
	}
	public Inet4Address getYourAddress() {
		return yourAddress;
	}
	public Inet4Address getServerAddress() {
		return serverAddress;
	}
	public Inet4Address getGatewayAddress() {
		return gatewayAddress;
	}
	public Inet4Address getSubnetMask() {
		return subnetMask;
	}
	public MACAddress getClientHardwareAddress() {
		return clientHardwareAddress;
	}
	public String getServerName() {
		return serverName;
	}
	public String getFile() {
		return file;
	}
	public Inet4Address getTftpServerAddress() {
		return tftpServerAddress;
	}
	public int getUnknown7() {
		return unknown7;
	}
	public String getUnknown8() {
		return unknown8;
	}
	public Inet4Address getDnsServerAddress() {
		return dnsServerAddress;
	}
	public void getBytes(PTMPDataWriter writer) {
		writer.writeByte(messageType);
		writer.writeByte(unknown1);
		writer.writeByte(unknown2);
		writer.writeByte(unknown3);
		writer.writeString(transactionId);
		writer.writeShort(secondsElapsed);
		writer.writeShort(flags);
		writer.writeInt(unknown4);
		writer.writeInt(unknown5);
		writer.writeInt(unknown6);
		writer.writeIP4Addres(clientAddress);
		writer.writeIP4Addres(yourAddress);
		writer.writeIP4Addres(serverAddress);
		writer.writeIP4Addres(gatewayAddress);
		writer.writeIP4Addres(subnetMask);
		writer.writeMACAddress(clientHardwareAddress);
		writer.writeString(serverName);
		writer.writeString(file);
		writer.writeIP4Addres(tftpServerAddress);
		writer.writeInt(unknown7);
		writer.writeString(unknown8);
		writer.writeIP4Addres(dnsServerAddress);
	}
	
	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}
	public void setUnknown1(byte unknown1) {
		this.unknown1 = unknown1;
	}
	public void setUnknown2(byte unknown2) {
		this.unknown2 = unknown2;
	}
	public void setUnknown3(byte unknown3) {
		this.unknown3 = unknown3;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public void setSecondsElapsed(short secondsElapsed) {
		this.secondsElapsed = secondsElapsed;
	}
	public void setFlags(short flags) {
		this.flags = flags;
	}
	public void setUnknown4(int unknown4) {
		this.unknown4 = unknown4;
	}
	public void setUnknown5(int unknown5) {
		this.unknown5 = unknown5;
	}
	public void setUnknown6(int unknown6) {
		this.unknown6 = unknown6;
	}
	public void setClientAddress(Inet4Address clientAddress) {
		this.clientAddress = clientAddress;
	}
	public void setYourAddress(Inet4Address yourAddress) {
		this.yourAddress = yourAddress;
	}
	public void setServerAddress(Inet4Address serverAddress) {
		this.serverAddress = serverAddress;
	}
	public void setGatewayAddress(Inet4Address gatewayAddress) {
		this.gatewayAddress = gatewayAddress;
	}
	public void setSubnetMask(Inet4Address subnetMask) {
		this.subnetMask = subnetMask;
	}
	public void setClientHardwareAddress(MACAddress clientHardwareAddress) {
		this.clientHardwareAddress = clientHardwareAddress;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public void setTftpServerAddress(Inet4Address tftpServerAddress) {
		this.tftpServerAddress = tftpServerAddress;
	}
	public void setUnknown7(int unknown7) {
		this.unknown7 = unknown7;
	}
	public void setUnknown8(String unknown8) {
		this.unknown8 = unknown8;
	}
	public void setDnsServerAddress(Inet4Address dnsServerAddress) {
		this.dnsServerAddress = dnsServerAddress;
	}
	
	
	public void parse(PTMPDataReader reader) {
		messageType = reader.readByte();
		unknown1 = reader.readByte();
		unknown2 = reader.readByte();
		unknown3 = reader.readByte();
		transactionId = reader.readString();
		secondsElapsed = reader.readShort();
		flags = reader.readShort();
		unknown4 = reader.readInt();
		unknown5 = reader.readInt();
		unknown6 = reader.readInt();
		clientAddress = reader.readIP4Addres();
		yourAddress = reader.readIP4Addres();
		serverAddress = reader.readIP4Addres();
		gatewayAddress = reader.readIP4Addres();
		subnetMask = reader.readIP4Addres();
		clientHardwareAddress = reader.readMACAddress();
		serverName = reader.readString();
		file = reader.readString();
		tftpServerAddress = reader.readIP4Addres();
		unknown7 = reader.readInt();
		unknown8 = reader.readString();
		dnsServerAddress = reader.readIP4Addres();
	}
	
}