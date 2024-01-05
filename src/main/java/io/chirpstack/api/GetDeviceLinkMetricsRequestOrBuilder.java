// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

public interface GetDeviceLinkMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.GetDeviceLinkMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DevEUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
   * @return The devEui.
   */
  String getDevEui();
  /**
   * <pre>
   * DevEUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
   * @return The bytes for devEui.
   */
  com.google.protobuf.ByteString
      getDevEuiBytes();

  /**
   * <pre>
   * Interval start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start = 2;</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <pre>
   * Interval start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start = 2;</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <pre>
   * Interval start timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <pre>
   * Interval end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3;</code>
   * @return Whether the end field is set.
   */
  boolean hasEnd();
  /**
   * <pre>
   * Interval end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3;</code>
   * @return The end.
   */
  com.google.protobuf.Timestamp getEnd();
  /**
   * <pre>
   * Interval end timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndOrBuilder();

  /**
   * <pre>
   * Aggregation.
   * </pre>
   *
   * <code>.common.Aggregation aggregation = 4;</code>
   * @return The enum numeric value on the wire for aggregation.
   */
  int getAggregationValue();
  /**
   * <pre>
   * Aggregation.
   * </pre>
   *
   * <code>.common.Aggregation aggregation = 4;</code>
   * @return The aggregation.
   */
  Aggregation getAggregation();
}
