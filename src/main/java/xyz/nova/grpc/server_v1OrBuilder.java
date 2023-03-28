// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface server_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.server_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * LNS address, ex: endpoint.test.com
   * </pre>
   *
   * <code>string host = 1;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * LNS address, ex: endpoint.test.com
   * </pre>
   *
   * <code>string host = 1;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * LNS port, ex: 8080
   * </pre>
   *
   * <code>uint32 port = 2;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>.helium.iot_config.protocol_packet_router_v1 packet_router = 3;</code>
   * @return Whether the packetRouter field is set.
   */
  boolean hasPacketRouter();
  /**
   * <code>.helium.iot_config.protocol_packet_router_v1 packet_router = 3;</code>
   * @return The packetRouter.
   */
  xyz.nova.grpc.protocol_packet_router_v1 getPacketRouter();
  /**
   * <code>.helium.iot_config.protocol_packet_router_v1 packet_router = 3;</code>
   */
  xyz.nova.grpc.protocol_packet_router_v1OrBuilder getPacketRouterOrBuilder();

  /**
   * <code>.helium.iot_config.protocol_gwmp_v1 gwmp = 4;</code>
   * @return Whether the gwmp field is set.
   */
  boolean hasGwmp();
  /**
   * <code>.helium.iot_config.protocol_gwmp_v1 gwmp = 4;</code>
   * @return The gwmp.
   */
  xyz.nova.grpc.protocol_gwmp_v1 getGwmp();
  /**
   * <code>.helium.iot_config.protocol_gwmp_v1 gwmp = 4;</code>
   */
  xyz.nova.grpc.protocol_gwmp_v1OrBuilder getGwmpOrBuilder();

  /**
   * <code>.helium.iot_config.protocol_http_roaming_v1 http_roaming = 5;</code>
   * @return Whether the httpRoaming field is set.
   */
  boolean hasHttpRoaming();
  /**
   * <code>.helium.iot_config.protocol_http_roaming_v1 http_roaming = 5;</code>
   * @return The httpRoaming.
   */
  xyz.nova.grpc.protocol_http_roaming_v1 getHttpRoaming();
  /**
   * <code>.helium.iot_config.protocol_http_roaming_v1 http_roaming = 5;</code>
   */
  xyz.nova.grpc.protocol_http_roaming_v1OrBuilder getHttpRoamingOrBuilder();

  xyz.nova.grpc.server_v1.ProtocolCase getProtocolCase();
}