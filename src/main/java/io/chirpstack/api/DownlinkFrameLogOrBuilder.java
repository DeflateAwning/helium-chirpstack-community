// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/frame_log.proto

package io.chirpstack.api;

public interface DownlinkFrameLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.DownlinkFrameLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <pre>
   * Time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * Time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <pre>
   * PHYPayload.
   * </pre>
   *
   * <code>bytes phy_payload = 2;</code>
   * @return The phyPayload.
   */
  com.google.protobuf.ByteString getPhyPayload();

  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   * @return Whether the txInfo field is set.
   */
  boolean hasTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   * @return The txInfo.
   */
  io.chirpstack.api.gw.DownlinkTxInfo getTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   */
  io.chirpstack.api.gw.DownlinkTxInfoOrBuilder getTxInfoOrBuilder();

  /**
   * <pre>
   * Downlink ID.
   * </pre>
   *
   * <code>uint32 downlink_id = 4;</code>
   * @return The downlinkId.
   */
  int getDownlinkId();

  /**
   * <pre>
   * Gateway ID (EUI64).
   * </pre>
   *
   * <code>string gateway_id = 5;</code>
   * @return The gatewayId.
   */
  String getGatewayId();
  /**
   * <pre>
   * Gateway ID (EUI64).
   * </pre>
   *
   * <code>string gateway_id = 5;</code>
   * @return The bytes for gatewayId.
   */
  com.google.protobuf.ByteString
      getGatewayIdBytes();

  /**
   * <pre>
   * Message type.
   * </pre>
   *
   * <code>.common.MType m_type = 6;</code>
   * @return The enum numeric value on the wire for mType.
   */
  int getMTypeValue();
  /**
   * <pre>
   * Message type.
   * </pre>
   *
   * <code>.common.MType m_type = 6;</code>
   * @return The mType.
   */
  io.chirpstack.api.MType getMType();

  /**
   * <pre>
   * Device address (optional).
   * </pre>
   *
   * <code>string dev_addr = 7;</code>
   * @return The devAddr.
   */
  String getDevAddr();
  /**
   * <pre>
   * Device address (optional).
   * </pre>
   *
   * <code>string dev_addr = 7;</code>
   * @return The bytes for devAddr.
   */
  com.google.protobuf.ByteString
      getDevAddrBytes();

  /**
   * <pre>
   * Device EUI (optional).
   * </pre>
   *
   * <code>string dev_eui = 8;</code>
   * @return The devEui.
   */
  String getDevEui();
  /**
   * <pre>
   * Device EUI (optional).
   * </pre>
   *
   * <code>string dev_eui = 8;</code>
   * @return The bytes for devEui.
   */
  com.google.protobuf.ByteString
      getDevEuiBytes();

  /**
   * <pre>
   * Plaintext mac-commands.
   * </pre>
   *
   * <code>bool plaintext_mac_commands = 9;</code>
   * @return The plaintextMacCommands.
   */
  boolean getPlaintextMacCommands();
}
